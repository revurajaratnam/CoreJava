import java.util.Scanner;

public class ConditionsAndDecisions15 {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Enter a cost price :");
            int costPrice = sc.nextInt();
            System.out.println("Enter a selling price :");
            int sellingPrice = sc.nextInt();
            
            // int profitSet = sellingPrice - costPrice;
            // int lossSet = costPrice - sellingPrice;

            // int profit = profitSet/costPrice*100;
            // int loss = lossSet/costPrice*100;
    
            if(sellingPrice > costPrice){
                System.out.println("Profit : "+(sellingPrice-costPrice));
            }else{
    
                System.out.println("Loss : "+(costPrice-sellingPrice));
                
            }
    
            sc.close();
        }
}
