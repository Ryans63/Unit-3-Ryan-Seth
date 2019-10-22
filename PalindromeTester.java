import java.util.Scanner;
public class PalindromeTester{
public static void main(String[]args){

  Scanner scan = new Scanner(System.in);

  System.out.println("Enter in a palindrome");
  String a, b = "";
       a = scan.nextLine();
       int n = a.length();
       for(int i = n - 1; i >= 0; i--)
       {
           b = b + a.charAt(i);
       }
       if(a.equalsIgnoreCase(b))
       {
           System.out.println("The string is palindrome.");
       }
       else
       {
           System.out.println("The string is not palindrome.");
       }


}

}
