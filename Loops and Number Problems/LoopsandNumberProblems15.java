
import java.util.Scanner;

public class LoopsandNumberProblems15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int input = sc.nextInt();
        int perfect = 0;
        int i = 1;
        while(i<input){

            if(input % i ==0){
                perfect += i;
            }
            i++;
        }

        if(perfect == input && input >0){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Normal Number");

        }
        
        sc.close();
    }
}
