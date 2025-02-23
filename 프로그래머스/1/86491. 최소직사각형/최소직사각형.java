class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;  
        int maxHeight = 0; 
        
        for (int[] size : sizes) {
            int w = size[0]; 
            int h = size[1]; 
            
            int max = Math.max(w, h);
            int min = Math.min(w, h);
            
            maxWidth = Math.max(maxWidth, max);
            maxHeight = Math.max(maxHeight, min);
        }

        return maxWidth * maxHeight;
    }
}