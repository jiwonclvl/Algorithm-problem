class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long [n];
        long num =  x;
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = x;
            x += num; 
        }
        
        return answer;
        
    }
}