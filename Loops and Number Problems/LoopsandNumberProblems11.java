import java.util.Scanner;

public class LoopsandNumberProblems11 {
    public static  void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int input  = sc.nextInt();
        int product = 1;
        int temp = Math.abs(input);
        System.out.println();
       
          if(temp ==0 ){
            product =0;
          }else{
            for(;temp>0;temp/=10){
                product*=temp%10;
          }
          }
         System.out.println("Sum of digit " +product);
        sc.close();
    }
}
