import java.util.Scanner;

public class LoopsandNumberProblems14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        
        // Step 1: Count the total number of digits
        int temp = input;
        int count = 0;
        while (temp > 0) {
            count++;
            temp = temp / 10; // Moves to the next digit
        }
        
        // Step 2: Calculate the sum of digits raised to the power of 'count'
        temp = input; // Reset temp back to original input
        double sum = 0.0;
        while (temp > 0) {
            int digit = temp % 10;       // Gets the last digit
            sum += Math.pow(digit, count); // Adds digit^count to total sum
            temp = temp / 10;            // Removes the last digit
        }
        
        // Step 3: Check if it matches the input
        if (input == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not");
        }
        
        sc.close();
    }
}
