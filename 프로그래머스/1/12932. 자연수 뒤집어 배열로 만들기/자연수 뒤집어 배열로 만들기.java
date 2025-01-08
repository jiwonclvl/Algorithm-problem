import java.util.List;
import java.util.ArrayList;

class Solution {
    public int [] solution(long n) {
        
        List <Long> answer = new ArrayList<>();
        
        while(n != 0l) {
            answer.add(n % 10);
            n = n / 10;
        }
        
        int[] arr = answer.stream().mapToInt(Long::intValue).toArray();
        return arr;
    }
}