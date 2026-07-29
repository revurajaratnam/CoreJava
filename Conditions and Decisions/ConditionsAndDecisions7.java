import java.util.Scanner;

public class ConditionsAndDecisions7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char: ");
        char ch =sc.next().charAt(0);
        // String ch = sc.next();
     

        if(ch >='A'&&ch <='Z' || ch >= 'a'&& ch <='z' ){
            System.out.println("Alphabet");
        }else{
            System.out.println("Digit");
        }

        sc.close();
    }
}
