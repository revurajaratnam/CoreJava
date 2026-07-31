import java.util.Scanner;

public class LoopsandNumberProblems10 {
     public static  void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int input  = sc.nextInt();
        int sum = 0;
        int temp = Math.abs(input);
        System.out.println();
       
          if(temp ==0 ){
            sum =0;
          }else{
            for(;temp>0;temp/=10){
                sum+=temp%10;
          }
          }
         System.out.println("Sum of digit " +sum);
        sc.close();
    }
}
