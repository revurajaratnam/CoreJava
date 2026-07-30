import java.util.Scanner;

public class ConditionsAndDecisions12 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Enter a firsttriangle :");
            int firstTriangle = sc.nextInt();
            System.out.println("Enter a secondtriangle :");
            int secondTriangle = sc.nextInt();
            System.out.println("Enter a thirdtriangle :");
            int thirdTriangle = sc.nextInt();
    
            if(firstTriangle == secondTriangle || secondTriangle == thirdTriangle
                || firstTriangle == thirdTriangle ){
                System.out.println("Isosceles Triangle");
            }else{
    
                System.out.println("Not isosceles Triangle");
                
            }
    
            sc.close();
        }
}
