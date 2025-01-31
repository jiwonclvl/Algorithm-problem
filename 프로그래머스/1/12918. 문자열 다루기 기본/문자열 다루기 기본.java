class Solution {
    public boolean solution(String s) {
        
        if (s.length() != 4 && s.length()!= 6) {
            return false;
        }
        
        return s.chars().allMatch(Character::isDigit);
    }
}