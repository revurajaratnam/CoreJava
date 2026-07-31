
import java.util.Scanner;

public class ConditionsAndDecisions22 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("Enter your salary : ");
        int salary = sc.nextInt();
        System.out.println();
        System.out.println("After fetching your eligibility below:");
        if(age >=21 && age<=60 && salary >= 25000){
            System.out.println("Eligible");
        }else{
            System.out.println("Ineligible");

        }
    }
}
