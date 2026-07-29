
import java.util.Scanner;

public class BasicsAndOperations12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a minutes");
        int time  = sc.nextInt();
        int hours = time/3600;
        int minutesR = time%3600;// this is my struck point how to resolve it i didnt understand why we're using % modulo
        int minutes =minutesR/60;
        int seconds =minutes%60;
        System.out.println(hours + " hours "+ minutes + " minutes " +seconds +" seconds" );
    }
}
