
import java.util.Scanner;

public class BasicsAndOperations8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.err.println("Enter a radius :");
        int radius = sc.nextInt();
        double pi = 3.14;
        System.out.println("Area :"+(pi*(radius*radius)));
        System.out.println("Circumference :"+(pi*(radius*2)));
    }
}
