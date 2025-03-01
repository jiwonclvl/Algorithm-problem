import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {        
        String result = "";
        
        for (int i = 0; i < strings.length; i ++) {
            result += strings[i].charAt(n);
        }
        
        long cnt = result.chars().distinct().count();
        
        if (cnt < strings.length) {
            Arrays.sort(strings);
        }
        
        Arrays.sort(strings, Comparator.comparing(s -> s.charAt(n)));
        
        return strings;
    }
}