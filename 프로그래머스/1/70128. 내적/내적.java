import java.util.stream.IntStream;
class Solution {
    public int solution(int[] a, int[] b) {
        int result = 0;
        
        //for문
//         for (int i = 0; i < a.length; i++) {
//             result += a[i] * b[i];
//         }
        
        //스트림
        result = IntStream.range(0,a.length).map(i -> a[i] * b[i]).sum();
        return result;
    }
}