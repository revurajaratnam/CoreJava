import  java.util.Scanner;
public class LoopsandNumberProblems5 {
    public static  void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int input  = sc.nextInt();
        System.out.println();
        int sum =0 ;
        for(int i =1; i<=input;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Sum of :"+sum);

    }
}
