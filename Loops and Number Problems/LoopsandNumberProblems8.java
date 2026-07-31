import java.util.Scanner;
public class LoopsandNumberProblems8 {
    public static  void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int input  = sc.nextInt();
        int sum = 0;
        System.out.println();
        for(int i =1; i<=input;i++){
            sum+=i*input;
        }
        System.out.println("Factorial : "+ sum);
        
    }

}
