
import java.util.Scanner;

public class BasicsAndOperations20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num  = sc.nextInt();

            System.out.println("First digit  of an integer : "+num/10000);

        sc.close();
    }
}
