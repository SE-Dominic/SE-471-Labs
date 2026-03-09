public class ObjectPool implements ObjectPoolIF {

  private Object lockObject = new Object();
  private int size;
  private int instanceCount;
  private int maxInstances;
  private Object[] pool;
  private static ObjectPool poolInstance = null;
  private ObjectCreationIF creator;

  private ObjectPool(ObjectCreationIF c, int max) {
    instanceCount = 0;
    creator = c;
    maxInstances = max;
    pool = new Object[maxInstances];
    size = 0;
  }

  public static synchronized ObjectPool getPoolInstance(ObjectCreationIF c, int max) {
    if (poolInstance == null) poolInstance = new ObjectPool(c, max);
    return poolInstance;
  }

  public int getSize() {
    return size;
  }

  public int getCapacity() {
    return maxInstances;
  }

  public void setCapacity(int c) {
    maxInstances = c;
  }

  public Object getObject() {
    synchronized (lockObject) {
      if (size > 0) {
        return removeObject();
      } else if (instanceCount < maxInstances) {
        return createObject();
      }
      return null;
    }
  }

  public Object waitForObject() {
    synchronized (lockObject) {
      while (true) {
        if (size > 0) {
          return removeObject();
        } else if (instanceCount < maxInstances) {
          return createObject();
        } else {
          try {
            lockObject.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    }
  }

  private Object removeObject() {
    size--;
    return pool[size];
  }

  public void release(Object o) {
    synchronized (lockObject) {
      pool[size] = o;
      size++;
      lockObject.notifyAll();
    }
  }

  private Object createObject() {
    instanceCount++;
    return creator.create();
  }
}
