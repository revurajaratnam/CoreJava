import java.util.Scanner;

public class ConditionsAndDecisions3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 >num2 && num1> num3){
            System.out.println("Big number :"+ num1);
        }else{
            System.out.println("Small number :" + num2);
        }

        sc.close();
    }
}
