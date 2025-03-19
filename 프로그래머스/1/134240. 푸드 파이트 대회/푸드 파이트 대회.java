class Solution {
    public String solution(int[] food) {
        int water = food[0];
        StringBuilder foodArr = new StringBuilder(); 
        
        for (int i = 1; i < food.length; i++){
            int size = food[i]/2;
            
            if (size == 0) {
                continue;
            }
            
            String count = Integer.toString(i);
            foodArr.append(count.repeat(size));
        }
        
        StringBuilder foodArr2 = new StringBuilder(foodArr.toString());
        foodArr2.reverse();
        
        foodArr.append("0");
        foodArr.append(foodArr2.toString());
        
        return foodArr.toString();
        
    }
}