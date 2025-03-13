import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        Map <String, Integer> list = new HashMap <>();
        int [] result = new int [s.length()];
        
        String[] str = s.split("");
        
        for (int i = 0; i < str.length; i++) {
            int value = list.getOrDefault(str[i],-1);
            
            if (value != -1) {
                result[i] = i - value;
            } else {
                result[i] = value;
            }
            
            list.put(str[i],i);
        }

        return result;
    }
}