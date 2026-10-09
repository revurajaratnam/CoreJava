public class LoopsandNumberProblems22 {
     public static boolean  isprime(int  num){
           if(num<=1){
            return false;
           }
           for(int i =2 ; i<num;i++){
            if(num%i==0){
                return false;
            }
           }

        return  true;
     }
    public static void main(String[] args) {
    
      int num = 7;
      if(isprime(num)){
        System.out.println("Prime ");
      }else{
        System.out.println("not a prime");
      }
       
        


    }
}
