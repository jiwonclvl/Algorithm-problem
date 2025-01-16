import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
    
        List<Integer> result = new ArrayList<>();
        for(int num : arr) {
            if (num % divisor == 0) {
                result.add(num);
            }
        }
        
        int arrSize = result.size();
        int [] answer = new int [arrSize];
        
        //element가 하나도 없을 때
        if(arrSize == 0) {
            int []  noElement = {-1};
            return noElement;
        }
        
        //있다면 복사해서 넣기
        for (int j = 0; j < arrSize; j++) {
            answer[j] = result.get(j);
        }
        
        //오름차순 정렬하기
        Arrays.sort(answer);
        return answer;
    }
}