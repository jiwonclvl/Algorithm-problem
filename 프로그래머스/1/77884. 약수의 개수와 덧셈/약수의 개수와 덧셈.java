class Solution {
    public int solution(int left, int right) {
        // 약수의 개수 저장
        int count = 0;
        
        //결과 값
        int result = 0;
        
        for (int i = left; i <= right; i++) {
            
            // 개수 초기화
            count = 0;
            
            //개수 구하기 
            for (int j = 1; j <= i; j++) {
                if(i%j == 0){
                    count ++;
                }
            }
            
            //개수에 따른 결과값 연산
            if (count % 2 == 0) {
                result += i;
            } else {
                result -= i;
            }
        }
            
        return result;
    }
}