
import java.util.Scanner;

public class BasicsAndOperations23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first subject marks :");
        int subject1 = sc.nextInt();
        System.out.println("Enter second subject marks :");
        int subject2 = sc.nextInt();
        System.out.println("Enter third subject marks :");
        int subject3 = sc.nextInt();
        System.out.println("Enter fourth subject marks :");
        int subject4 = sc.nextInt();
        System.out.println("Enter fifth subject marks :");
        int subject5 = sc.nextInt();
        int total =0;

        double addedTotalMarks = (subject1+subject2+subject3+subject4+subject5)/5;

        System.out.println("Total Percentage: " +addedTotalMarks);





        sc.close();
    }
}
