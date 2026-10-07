public class LoopsandNumberProblems21 {
     public static String Reverse(String s){
            String reversed = "";
        for(int i =s.length()-1; i>=0;i--){
            reversed = reversed + s.charAt(i);

        }
        return  reversed;
     }
    public static void main(String[] args) {
    
      String s ="Hello";
      System.out.println(Reverse(s));
       
        


    }
}
