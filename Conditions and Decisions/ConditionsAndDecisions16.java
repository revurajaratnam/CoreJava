import java.util.Scanner;

public class ConditionsAndDecisions16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Electricity Bill :");
        int units = sc.nextInt();
        //this is chatGpt code
        double firstRate = 1.5;
        double secondRate = 2.5;
        double finalTotal = 0.0;

        if (units <= 100) {
            finalTotal = units * firstRate;
        } else if (units <= 200) {
            finalTotal = (100 * firstRate) + ((units - 100) * secondRate);
        } else {
            finalTotal = (100 * firstRate) + (100 * secondRate) + ((units - 200) * firstRate);
        }

        System.out.println("Total Electricity Bill : " + finalTotal);

        sc.close();
    }
}
