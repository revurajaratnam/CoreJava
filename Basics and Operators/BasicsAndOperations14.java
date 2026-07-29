
import java.util.Scanner;

public class BasicsAndOperations14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pricipal amount: ");
        int principal = sc.nextInt();
        System.out.println("Enter rate of interest: ");
        int rate = sc.nextInt();
        System.out.println("Enter time of months: ");
        int time = sc.nextInt();
        double totalAmount = principal*Math.pow(1+(rate /100.0),time);
        System.out.println("Compound Interest :" +totalAmount);
        System.out.println("Total  Amount :" +(principal+totalAmount));
    }
}
