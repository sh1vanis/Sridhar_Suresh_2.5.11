import java.util.Scanner;
class NimRunner {
  public static void main(String[] args) {
    Object objects = new Object();
    objects.initializeNumObjects();
    int num = objects.getNumObjects();

    Scanner automate = new Scanner(System.in);
    System.out.println("Do you want to play against another player or the computer?");
    String automated = automate.nextLine();
    if (automated.toLowerCase().equals("player")) {
    Scanner player1Prompt = new Scanner(System.in);
    System.out.println("Player 1, enter your name: ");
    String player1Input = player1Prompt.nextLine();

    Scanner player2Prompt = new Scanner(System.in);
    System.out.println("Player 2, enter your name: ");
    String player2Input = player2Prompt.nextLine();

    System.out.println();
    
    Player player1 = new Player();
    player1.initiateName(player1Input);
    
    Player player2 = new Player();
    player2.initiateName(player2Input);

    System.out.println(player1.getName() + " is playing against " + player2.getName());
    System.out.println("With " + num + " objects in the pile.");

    boolean oneObject = false;
    Player currentPlayer = player1;
    
    while (oneObject == false) {
      System.out.println(currentPlayer.getName() + "'s turn:");
      Scanner inputObject = new Scanner(System.in);
      System.out.println(currentPlayer.getName() + ", enter how many objects you want to remove: ");
      int numInput = inputObject.nextInt();

      objects.removeObjects(numInput);

      if (currentPlayer == player1) {
        currentPlayer = player2;
      
      } else {
        currentPlayer = player1;
      }

      if (objects.getNumObjects() == 1) {
        System.out.println("\nThere is only one object left.");
        System.out.println(currentPlayer.getName() + " loses!");
        oneObject = true;
      }
      else {
      System.out.println("\nThere are now " + objects.getNumObjects() + " objects.");
      }
    }
    }
    else{
        Scanner player1Prompt = new Scanner(System.in);
        System.out.println("Player 1, enter your name: ");
        String player1Input = player1Prompt.nextLine();

        System.out.println();

        Player player1 = new Player();
        player1.initiateName(player1Input);

        AutomatedPlayer player2 = new AutomatedPlayer();
        player2.initiateName("Computer");

      System.out.println();

      System.out.println(player1.getName() + " is playing against " + player2.getName());
      System.out.println("With " + num + " objects in the pile.");

      boolean oneObject = false;
      boolean currentlyPlayer1 = true;
      while (oneObject == false) {
      if (currentlyPlayer1 == true){
      
        System.out.println(player1.getName() + "'s turn:");
        Scanner inputObject = new Scanner(System.in);
        System.out.println(player1.getName() + ", enter how many objects you want to remove: ");
        int numInput = inputObject.nextInt();

        objects.removeObjects(numInput);
        System.out.println("There are now " + objects.getNumObjects() + " objects.");
        currentlyPlayer1 = false;
        if (objects.getNumObjects() == 1) {
          System.out.println("\nThere is only one object left.");
          if (currentlyPlayer1 == false){
          System.out.println(player2.getName() + " loses!");
          }
          else{
            System.out.println(player1.getName() + " loses!");
          }
          oneObject = true;
        }
        }
        
      else{
        System.out.println();
          System.out.println(player2.getName() + "'s turn:");
          player2.computerTurn(objects.getNumObjects());
          int numInput = player2.getComputerInput();
        objects.removeObjects(numInput);
          System.out.println(player2.getName() + " removed " + numInput + " objects. There are now " + objects.getNumObjects() + " objects.");
          System.out.println();
        
        currentlyPlayer1 = true;
        
        if (objects.getNumObjects() == 1) {
          System.out.println("\nThere is only one object left.");
          if (currentlyPlayer1 == false){
          System.out.println(player2.getName() + " loses!");
          }
          else{
            System.out.println(player1.getName() + " loses!");
          }
          oneObject = true;
        }
      }
    }
      
  }
}
}