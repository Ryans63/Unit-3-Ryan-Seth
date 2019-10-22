import java.util.Scanner;
public class MinofThree{
  public static void main(String[]args){

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter in an integer");
    int num1 = scan.nextInt();
    System.out.println("Enter in a second integer");
    int num2 = scan.nextInt();
    System.out.println("Enter in a third integer");
    int num3 = scan.nextInt();

if(num1 < num2 && num1 < num3)
System.out.println(num1 + " is the minimum integer");
else if(num2 < num3 && num1 < num1)
System.out.println(num2 + " is the minimum integer");
else if(num3 < num2 && num3 < num1)
System.out.println(num3 + " is the minimum integer");
  else
  System.out.println("There is not a minimum");
  }
}
