import java.util.Scanner;
public class BasicsAndOperations4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int num1 = sc.nextInt();
        System.err.println("Enter a second number: ");
        int num2 = sc.nextInt();

        System.out.println("Quotient :"+(num1 / num2));
        System.out.println("Remainder : "+ (num1 % num2));
    }
}
