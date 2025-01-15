class Solution {
    public int solution(long num) {
        int count = 0;
        
        if(num == 1) {
            return 0;
        }
        
        while (true) {
            if (num == 1) {
                break;
            } else {
                if (num % 2 == 0) {
                    num = num / 2;
                } else if (num % 2 != 0) {
                    num = (num * 3) + 1;
                }
                count ++;

                if (count == 500) {
                    break;
                }
            }
        }
        
        return count == 500 ? -1 : count;
    }
}