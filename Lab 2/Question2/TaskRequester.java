public class TaskRequester implements Runnable {

  private ObjectPool server;
  private static int counter = 0;
  private int taskID;

  public TaskRequester(ObjectPool p) {
    server = p;
    taskID = ++counter;
  }

  public void run() {
    System.out.println("Requester " + taskID + " is requesting an agent...");
    AgentIF agent = (AgentIF) server.waitForObject();
    agent.setTaskID(taskID);
    agent.startTask();
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    agent.stopTask();
    System.out.println("Requester " + taskID + " done, releasing agent.");
    server.release(agent);
  }
}
