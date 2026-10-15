
import java.util.HashMap;
import java.util.Map;

public class LoopsandNumberProblems24 {
     
    public static void main(String[] args) {

        Map<String, Integer> keys = new HashMap<>();

        keys.put("id", 101);
        for(Integer key :keys.values() ){
            System.out.println(key);
        }
        keys.clear();
        System.out.println(keys);



    }
}
