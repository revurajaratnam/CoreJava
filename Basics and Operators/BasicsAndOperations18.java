
import java.util.Scanner;

public class BasicsAndOperations18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

            System.out.println("Enter a number");
            int num = sc.nextInt();
            double km = 0.621371;
            System.out.println((num*km)+" miles");


        sc.close();
    }
}
