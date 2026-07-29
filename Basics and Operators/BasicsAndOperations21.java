
import java.util.Scanner;

public class BasicsAndOperations21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            int num1 = num%10;
            int num2= num/10000;
             System.out.println("first and last digits : "+ (num1 +num2));

        sc.close();
    }
}
