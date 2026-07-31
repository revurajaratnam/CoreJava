import java.util.Scanner;
public class LoopsandNumberProblems8 {
    public static  void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int input  = sc.nextInt();
        int result = 1;
        System.out.println();
        for(int i =1; i<=input;i++){
           result = result*i;
        }
        System.out.println("Factorial : "+ result);
         
    }

}
