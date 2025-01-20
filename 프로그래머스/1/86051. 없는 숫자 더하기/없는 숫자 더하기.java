import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        List<Integer> num = new ArrayList<>();
        int result = 0;
        
        for (int i : numbers) {
            num.add(i);
        }
        
        for (int j = 0; j < 10; j++) {
            if(num.contains(j)) {
                continue;
            }
            else {
                result += j; 
            }
        }
        
        return result;
    }
}