import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        Map <String, Integer> list = new HashMap <>();
        int [] result = new int [s.length()];
        
        String[] str = s.split("");
        
        for (int i = 0; i < str.length; i++) {
            if (!list.keySet().contains(str[i])) {
                list.put(str[i],i);
                result[i] = -1;
            } else {
                result[i] = i - list.get(str[i]);
                list.put(str[i],i);
            }
        }

        return result;
    }
}