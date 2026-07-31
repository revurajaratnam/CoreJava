import java.util.Scanner;
public class LoopsandNumberProblems1 {
    public static  void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int input  = sc.nextInt();
        System.out.println();

        for(int i =input; i>=1;i--){
            System.out.println(i);
        }
    }
}
