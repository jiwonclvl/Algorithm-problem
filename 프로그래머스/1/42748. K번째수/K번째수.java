import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        int id = 0;
        
        for (int[] cmd : commands) {
            int i = cmd[0];  
            int j = cmd[1];  
            int k = cmd[2];  
            
            int[] arr = Arrays.copyOfRange(array, i - 1, j);
            
            Arrays.sort(arr);
            
            result[id] = arr[k - 1];
            id++;
        }
        
        return result;
    }
}