import java.util.Scanner;

public class BasicsAndOperations13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount :");
        int principal = sc.nextInt();
        System.out.println("Enter rate of intrest :");
        int rate = sc.nextInt();
        System.out.println("Enter time (Like Months) :");
        int time = sc.nextInt();
        int totalAmount = principal*rate*time/100;
        System.out.println("Simple Intrest :" + totalAmount);
        System.out.println("Total Amount :" +(principal+totalAmount));
    }
}
