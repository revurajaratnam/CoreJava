
import java.util.Scanner;

public class BasicsAndOperations17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your weight");
        int weight = sc.nextInt();
        System.out.println("Enter your height");
        double height = sc.nextDouble();

        System.out.println("BMI :"+(weight/Math.pow(height, 2)));

 



        sc.close();
    }
}
