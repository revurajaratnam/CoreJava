import java.util.*;
public class LoopsandNumberProblems17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int input = sc.nextInt();

        int i =0;
        while (i<input) {
            System.out.println(i);
            i++;
        }
        System.out.println("Above loop iteration is completed now..!");
    }
}
