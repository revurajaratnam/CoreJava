
import java.util.Scanner;

public class BasicsAndOperations6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a celsius to fahrenheit: ");
        int num1 = sc.nextInt();
        System.out.println("Enter a fahrenheit to celsius: ");
        int num2 = sc.nextInt();

        System.out.println("celsius to fahrenheit : "+(num1 * 9/5 + 32));
        System.out.println("fahrenheit to celsius : "+((num2-32) * 5/9));

    }
}
