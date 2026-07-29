import java.util.Scanner;

public class BasicsAndOperations11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a time :");
        int time = sc.nextInt();
        int hours = time/60;
        int minutes = time-60*hours;
        System.out.println(hours + " hours " + minutes + "  minutes");
    }
}
