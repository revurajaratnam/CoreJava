
import java.util.Scanner;

public class ConditionsAndDecisions21 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  a first number :");
        int input1 = sc.nextInt();
        System.out.println("Enter  a  second number :");
        int input2 = sc.nextInt();
        System.out.println("Enter  a charchter :");
        String ch = sc.next();
        
        switch (ch) {
            case "%":
                System.out.println((input1%input2));
                break;
        
            default:
                break;
        }
    }
}
