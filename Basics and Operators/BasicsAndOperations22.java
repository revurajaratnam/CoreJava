
import java.util.Scanner;

public class BasicsAndOperations22 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int salary = sc.nextInt();
        int hra=20;
        int da = 10;
        int addedAllAllowences = salary+(salary*hra/100)+(salary*da/100);
        System.out.println("Grosss Salary : "+addedAllAllowences);
        sc.close();
    }
}
