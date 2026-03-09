public class CIAAgentCreator implements ObjectCreationIF {

  private String[] footPrints = { "A", "B", "C", "D", "E" };
  private int index = 0;

  public Object create() {
    CIAAgent agent = new CIAAgent(footPrints[index++]);
    new Thread(agent).start();
    return agent;
  }
}
