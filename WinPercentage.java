import java.util.Scanner;
public class WinPercentage{

  public static void main(String[]args){

      Scanner scan = new Scanner(System.in);
      System.out.println("Input the total number of games played");
      int gamesplayed = scan.nextInt();

      System.out.println("Input the total number of games won");
      int gameswon = scan.nextInt();

      while(gamesplayed<=0){
      System.out.println("Number of games played has to be greater than 0");
      System.out.println("Input a valid number of games played");
      gamesplayed = scan.nextInt();
    }
      while(gameswon<0){
      System.out.println("Number of games won cannot be a negative number");
      System.out.println("Input a valid number of games won");
      gameswon = scan.nextInt();
    }
    while(gameswon>gamesplayed){
      System.out.println("Number of games won cannot be greater than number of games played");
      System.out.println("Input a valid number of games won");
      gameswon = scan.nextInt();
    }
    double percent = (double) gameswon / gamesplayed;
    System.out.println("Your win percentage is " + (percent*100) + "%");


  }
}
