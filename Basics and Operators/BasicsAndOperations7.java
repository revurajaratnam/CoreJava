
import java.util.Scanner;

public class BasicsAndOperations7 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a length :");
        int length = sc.nextInt();
        System.out.println("Enter a width :");
        int width = sc.nextInt();

        System.out.println("Area : "+(length*width));
        System.out.println("Perimeter : "+(2*(length+width)));

    }

}
