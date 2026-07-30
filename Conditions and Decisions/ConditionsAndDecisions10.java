
import java.util.Scanner;

public class ConditionsAndDecisions10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a firsttriangle :");
        int firstTriangle = sc.nextInt();
        System.out.println("Enter a secondtriangle :");
        int secondTriangle = sc.nextInt();
        System.out.println("Enter a thirdtriangle :");
        int thirdTriangle = sc.nextInt();

        if(firstTriangle+secondTriangle>thirdTriangle
           && 
           secondTriangle+thirdTriangle >firstTriangle
           &&
           thirdTriangle+firstTriangle > secondTriangle
        ){
            System.out.println("Valid Triangle");
        }else{

            System.out.println("Invalid Triangle");
            
        }

        sc.close();
    }
}
