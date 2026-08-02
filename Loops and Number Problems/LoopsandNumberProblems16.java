import java.util.Scanner;

public class LoopsandNumberProblems16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int input = sc.nextInt();
        int perfect = 0;
        int i = 1;
        while(i<input){
            if(perfect<0){
                System.out.println("");
            }
           
            i++;
        }

       
        
        sc.close();
    }
}
