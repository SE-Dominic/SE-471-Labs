public class FBIAgent implements Runnable, AgentIF {

  private boolean workingInProgress;
  private String myFootPrint;
  private int taskID;

  public FBIAgent(String footprint) {
    myFootPrint = footprint;
    workingInProgress = false;
  }

  public void run() {
    while (true) {
      if (workingInProgress) {
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        processing();
      } else {
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }

  private void processing() {
    System.out.println("FBI Agent [" + myFootPrint + "] is working on task " + taskID);
  }

  public void startTask() {
    workingInProgress = true;
  }

  public void stopTask() {
    workingInProgress = false;
  }

  public void setTaskID(int id) {
    taskID = id;
  }
}
