class Solution {
    public String solution(int n) {
        String word1 = "수";
        String word2 = "박";
        String result = "";
        
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                result += word2;
            } else {
                result += word1;    
            }
        }
        
        return result;
    }
}