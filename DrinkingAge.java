import java.util.Scanner;

public class DrinkingAge{

public static void main(String[]args){

System.out.println("How old are you?");

Scanner scan = new Scanner(System.in);

int age = scan.nextInt();

if(age>=21)
  System.out.println("You are old enough to drink");
else
  System.out.println("You are not old enough to drink");
}

}
