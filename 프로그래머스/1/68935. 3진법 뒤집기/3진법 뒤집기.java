class Solution {
    public int solution(int n) {
        String ternary = Integer.toString(n,3);
        StringBuilder sb = new StringBuilder(ternary);
        
        //문자열 뒤집기
        String reverseTernary = sb.reverse().toString();
        
        //int로 변환
        return Integer.parseInt(reverseTernary,3);
        
    }
}