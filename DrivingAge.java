import java.util.Scanner;
public class DrivingAge{

public static void main(String[]args){

Scanner scan = new Scanner(System.in);

  System.out.println("How old are you?");

  int age = scan.nextInt();

  if(age>=16)
    System.out.println("You are old enough to drive");
    else if(age>=21)
      System.out.println("You are old enough to drive and drink(not at the same time)");
  else
    System.out.println("You are not old enough to drive");



}
}
