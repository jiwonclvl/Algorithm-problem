 enum Number {
    ZERO(0, "zero"),
    ONE(1, "one"),
    TWO(2, "two"),
    THREE(3, "three"),
    FOUR(4, "four"),
    FIVE(5, "five"),
    SIX(6, "six"),
    SEVEN(7, "seven"),
    EIGHT(8, "eight"),
    NINE(9, "nine");

    private int num;
    private String str;
    
    Number(int num, String str) {
        this.num = num;
        this.str = str;
    }
    
    public String stringNumber() {
        return this.str;
    }   
     
    public int number() {
        return this.num;
    } 
}

class Solution {
    public int solution(String s) {
        for(Number num : Number.values()) {
            if (s.contains(num.stringNumber())) {
                s = s.replace(num.stringNumber(), String.valueOf(num.number()));
            }
        }
        
        return Integer.parseInt(s);
    }
}