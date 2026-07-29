import java.util.Scanner;

public class BasicsAndOperations2 {
    public static void main (String args []){

        Scanner sc = new Scanner(System.in);
        
        System.err.println("Enter a first number:");
        int num1 = sc.nextInt();
        System.err.println("Enter a second number:");
        int num2 = sc.nextInt();

        System.out.println("Result : "+ (num1 - num2));
    }
}
