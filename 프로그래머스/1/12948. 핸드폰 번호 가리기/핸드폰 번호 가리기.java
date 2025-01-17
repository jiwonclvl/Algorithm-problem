class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        String answer = phone_number.substring(length- 4, length);
        String secret = "*";
        String result = secret.repeat(length - 4) + answer;

        return result;
    }
}