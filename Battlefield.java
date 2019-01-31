import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    battleship(board());
  }

  public static char[][] board(){    //makes the board
    char[][] board = new char[10][10]; //makes og board
    for(int i = 0; i < 10; i++){
      for(int j = 0; j < 10; j++){
        board[i][j]= '*';
        System.out.print(board[i][j]);
        System.out.print(" ");
      }
      System.out.println();
    }
    return board;
  }//end of method

  public static void battleship(char[][] board){
    int[] xcords = {
      0,0,0,0,0,0,0,0,0,0
    };
    for(int i = 0; i < xcords.length; i++){
      double rand = Math.random()*10;
      xcords[i] = (int)(rand);
    }
    int[] ycords = {
      0,0,0,0,0,0,0,0,0,0
    };
    for(int i = 0; i < ycords.length; i++){
      double random = Math.random()*10;
      ycords[i] = (int)(random);
    }

    for(int i = 0; i < xcords.length; i++) {
      for(int j = 1; j < xcords.length; j++){
        if(xcords[i]==xcords[j] && ycords[i]==ycords[j]) {
          xcords[j] = (int)(Math.random()*10);
          ycords[j] = (int)(Math.random()*10);
        } //this was supposed to make sure that no ships would have the same coordinates
      }
    } 
  //end of the method
  
  int ships = 0;
  while(ships < 10){

  System.out.println("Enter two integers between 0 and 9:");
  Scanner in = new Scanner(System.in);
  int us1 = in.nextInt();
  int us2 = in.nextInt();
      
      for(int j = 0; j < xcords.length; j++) {
          System.out.print(xcords[j] + " ");
        } System.out.println();
        for(int j = 0; j < ycords.length; j++) {
          System.out.print(ycords[j] + " ");
        } System.out.println();
      for(int i = 0; i < xcords.length; i++){
        if(xcords[i]==us1 && ycords[i]==us2) {
          board[xcords[i]][ycords[i]] = 'H';
          ships++;
          break;
        } 
        if(i==9) board[us1][us2] = 'O';
      }
         
      for(int i=0; i < xcords.length;i++){
        for(int j=0; j < xcords.length;j++){
          System.out.print(board[i][j]+" ");
        }
        System.out.println();
      }
      }
    System.out.println("Congrats! You did it!");
  }
}