class Solution {
    public int solution(String t, String p) {
        Long num = Long.parseLong(p);
        int count = 0;
        char [] answer = t.toCharArray();
        
        for (int i = 0; i < t.length(); i++) {
            String result = "";
            
            if (i + p.length() > t.length()) {
                break;
            }
            
            for (int j = i; j < i + p.length(); j ++) {
                result += answer[j];    
            }
            
            Long rs = Long.parseLong(result);
    
            if (rs <= num) {
                count ++;
            }   
        }
        
        return count;
        
    }
}