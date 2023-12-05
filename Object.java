import java.lang.Math;
public class Object {
  private int numObjects;
  public void initializeNumObjects() {
    numObjects = (int) (Math.random() * (50 - 10 + 1)) + 10 ;
  }
  public void removeObjects(int num) {
    double halfObjects = this.numObjects / 2.0;
    int temp_num = this.numObjects - num;
    if (temp_num >= halfObjects) {
      this.numObjects -= num;
    }
    else {
      System.out.println("Sorry, you cannot take that many objects! Your turn is skipped!");
    }
  }
  public int getNumObjects() {
    return this.numObjects;
  }
}
