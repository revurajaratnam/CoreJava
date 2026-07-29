
import java.util.Scanner;

public class BasicsAndOperations10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Square result is: "+(Math.pow(num, 2)));
        System.out.println("Cube result is: "+(Math.pow(num, 3)));

    }
}
