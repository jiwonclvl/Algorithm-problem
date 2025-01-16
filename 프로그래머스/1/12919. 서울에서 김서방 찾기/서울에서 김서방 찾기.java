class Solution {
    public String solution(String[] seoul) {
        String result = "";
        int i = 0;
        for(String name : seoul) {
            if ("Kim".equals(name)) {
                break;
            }
            i ++;
        }
        
        result = "김서방은 " + i + "에 있다";
        return result;
    }
}