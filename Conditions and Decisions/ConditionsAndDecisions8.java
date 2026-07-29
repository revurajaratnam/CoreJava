import java.util.Scanner;

public class ConditionsAndDecisions8 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char: ");
        char ch =sc.next().charAt(0);
        // String ch = sc.next();
     

        if(ch >='A'&&ch <='Z'  ){
            System.out.println("Uppercase");
        }else if(ch >= 'a'&& ch <='z' ){
            System.out.println("Lowercase");
        }

        sc.close();
    }
}
