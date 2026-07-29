
import java.util.Scanner;

public class BasicsAndOperations16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  a amount");
        double amount = sc.nextDouble();
        System.out.println("Enter  a gst");
        double gst = sc.nextDouble();
        double addedGst = amount*(gst/100);
        System.out.println("GST Amount :"+addedGst );
        System.out.println("Total  Bill :"+ (amount+addedGst) );

    }
}
