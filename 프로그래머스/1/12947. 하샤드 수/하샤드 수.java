class Solution {
    public boolean solution(int x) {
        
        int number = x;
        int num = 0;
        for(int i = 0; i < 5; i++) {
            num += x % 10;
            x = x/10;
        }
        
        if(number%num == 0) {
            return true;
        } else {
            return false;
        }
        
    }
}