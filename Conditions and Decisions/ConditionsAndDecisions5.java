import java.util.Scanner;

public class ConditionsAndDecisions5 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int num1 = sc.nextInt();
     

        if(num1%4==0 && num1%100 !=0 || num1%400==0){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a leap year");
        }

        sc.close();
    }
}
