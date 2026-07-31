import java.util.Scanner;
public class LoopsandNumberProblems2 {
    
    public static  void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int input  = sc.nextInt();
        System.out.println();

        for(int i =1; i<=input;i++){
            if(i%2==0){
                System.out.print(i);
            }
        }
    }
}
