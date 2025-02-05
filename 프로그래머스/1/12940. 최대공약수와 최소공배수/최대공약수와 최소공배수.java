class Solution {
    public int[] solution(int n, int m) {
        
        //결과 리스트 
        int [] result = new int [2];
        int temp = 0;
        
        // 큰 값이 a, 작은 값이 b가 되도록 설정
        int a = Math.max(n, m);
        int b = Math.min(n, m);
            
        //최대 공약수 구하기
        while (true) {
            temp = a % b;
            a = b;
            b = temp;
            
            if (temp == 0) {
                break;
            }
        }
        result[0] = a;
                
        //최소 공배수 구하기
        result[1] = n * m / result[0];
        return result;
    }
}