public class LoopsandNumberProblems20 {
    public static int Factorial (int num){
        int result = 1;
        for(int i=1;i<num;i++){
            result+=result*i;
        }

        return result;
    }
    public static void main(String[] args) {
        
        int num =5;
        System.out.println(Factorial(num));



    }
}
