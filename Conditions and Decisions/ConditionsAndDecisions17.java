import java.util.Scanner;

public class ConditionsAndDecisions17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your salary  :");
        int salary = sc.nextInt();
        System.out.println("Enter your tenure  :");
        int tenure = sc.nextInt();
        double bounus = 0.0 ;

        if (tenure >5) {
            bounus = salary*10/100;
        }  else {
            bounus = salary*5/100;

        }
           

        System.out.println("Bounus : " + bounus );

        sc.close();
    
}
//chatgpt
}
