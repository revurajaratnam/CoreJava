import java.util.Scanner;

public class ConditionsAndDecisions9 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year: ");
        int num =sc.nextInt();
        // String ch = sc.next();
     

        if(num >18  ){
            System.out.println("Elgible");
        }else {
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}
