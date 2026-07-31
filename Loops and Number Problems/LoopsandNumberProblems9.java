import java.util.Scanner;

public class LoopsandNumberProblems9 {
     public static  void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int input  = sc.nextInt();
        int count = 0;
        int temp = Math.abs(input);
        System.out.println();
       
          if(temp ==0){
            count=1;
          }else{
            for(; temp>0;temp/=10){
                count++;
          }
        }
        System.out.println("Digits of integer : "+ count);
         
        sc.close();
    }

    // This is the chatGPT
}
