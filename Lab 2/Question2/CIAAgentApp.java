public class CIAAgentApp {

  public static void main(String[] args) {
    ObjectPool server = ObjectPool.getPoolInstance(new CIAAgentCreator(), 5);
    for (int i = 0; i < 10; i++) {
      Thread client = new Thread(new TaskRequester(server));
      client.start();
    }
  }
}
