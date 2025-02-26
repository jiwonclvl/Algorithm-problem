class Solution {
    public String solution(String s, int n) {
        StringBuilder result = new StringBuilder();
        int num = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (' ' == s.charAt(i)) {
                result.append(" ");
                continue;
            } 
            if (Character.isUpperCase(s.charAt(i))) {
                result.append((char) ((s.charAt(i) - 'A' + n) % 26 + 'A'));
            }
            if (Character.isLowerCase(s.charAt(i))) {
                result.append((char) ((s.charAt(i) - 'a' + n) % 26 + 'a'));
            }
        }
        
        return result.toString();
    }
}