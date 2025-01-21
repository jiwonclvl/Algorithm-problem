import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> result = new ArrayList<>();


        // 예외 처리 
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;  
        }
         
        //초기화
        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]);
        }
        
        int min = Collections.min(result);
        result.remove(Integer.valueOf(min));
        
        int [] answer = new int [result.size()];
        
        
        //배열로 돌리기
         for (int j = 0; j < result.size() ; j++) {
             answer[j] = result.get(j);
         }
        
        return answer;
        
        
    }
}