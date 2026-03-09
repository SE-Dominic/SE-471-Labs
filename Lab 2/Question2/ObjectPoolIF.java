public interface ObjectPoolIF {
  int getSize();
  int getCapacity();
  void setCapacity(int c);
  Object getObject();
  Object waitForObject();
  void release(Object o);
}
