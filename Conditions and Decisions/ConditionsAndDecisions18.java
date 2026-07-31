import java.util.Scanner;

public class ConditionsAndDecisions18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your salary  :");
        int input = sc.nextInt();
       

        if (input >= 10 && input <=50) {
         System.out.println("Inside Range");
        }  else {
           
            System.out.println("OutSide Range");
        }
           

        sc.close();
    
}
}
