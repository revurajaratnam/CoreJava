
import java.util.Scanner;
public class LoopsandNumberProblems {
    public static  void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int input  = sc.nextInt();
        System.out.println();

        for(int i =1 ; i<=input;i++){
            System.out.println(i);
        }
    }
}
