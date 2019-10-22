import java.util.Scanner;
public class MultiplesAssignment{
  public static void main(String[]args){
    int mult = 1;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter in a positive integer");
    int num1 = scan.nextInt();
    if (num1 <= 0){
      System.out.println("Integer must be a positive number");
      System.out.println("Enter in a valid integer");
      num1 = scan.nextInt();
    }
    System.out.println("Enter in an upper limit");
    int limit = scan.nextInt();
    if (limit < num1){
    System.out.println("Limit must be a greater number than the integer");
    System.out.println("Enter in a valid limit");
    limit = scan.nextInt();
  }
  for (mult = num1; mult <= limit; mult = mult+num1){
    System.out.print(mult + " ");

  }
  }
}
