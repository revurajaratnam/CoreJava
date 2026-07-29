import java.util.Scanner;
public class ConditionsAndDecisions2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if(num >0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }

        sc.close();
    }
}
