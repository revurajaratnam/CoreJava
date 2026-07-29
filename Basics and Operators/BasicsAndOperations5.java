import java.util.Scanner;

public class BasicsAndOperations5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter a second number :");
        int num2 = sc.nextInt();
        System.out.println("Enter a third number :");
        int num3 = sc.nextInt();
        System.out.println("Average result :" + ((num1+num2+num3)/3) );
    }
}
