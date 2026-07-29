
import java.util.Scanner;

public class BasicsAndOperations15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a price :");
        int price = sc.nextInt();
        System.out.println("Enter a discount :");
        double discount = sc.nextInt();
        double discountRate = price *(discount/100);
        System.out.println("Final Price :"+ (price-discountRate));
    }
}
