import java.util.*;
public class LoopsandNumberProblems17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int input = sc.nextInt();
        boolean isPrime = input>1;
        for(int i = 2 ; i*i <=input ;i++){
            if(input %i == 0){
                isPrime =false;
                break;
            }
        }
        System.out.println(input + "\n"+ (isPrime ? "is prime " : "is not prime"));
       
    }
}
