public class FBIAgentCreator implements ObjectCreationIF {

  private String[] footPrints = { "A", "B", "C", "D", "E" };
  private int index = 0;

  public Object create() {
    FBIAgent agent = new FBIAgent(footPrints[index++]);
    new Thread(agent).start();
    return agent;
  }
}
