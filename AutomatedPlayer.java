public class AutomatedPlayer {
  private String name;
  private int numTake;
  public void initiateName(String inputtedName) {
    this.name = inputtedName;
  }
  public String getName() {
    return this.name;
  }
  public void computerTurn(int num){
    if (num == 4){
      this.numTake = 1;
    }
    else{
      this.numTake = (num/2);
    }
  }
  public int getComputerInput() {
    return this.numTake;
  }
}