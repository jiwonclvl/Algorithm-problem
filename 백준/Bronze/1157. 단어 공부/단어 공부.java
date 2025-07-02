import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max = 0;
        int count = 0;
        Map<String, Integer> result = new HashMap<>();
        
        String str = sc.next();
        str = str.toUpperCase();

        //문자 카운트하기
        for (String s : str.split("")) {
            if (!result.containsKey(s)) {
                result.put(s, 1);
            } else {
                result.compute(s, (k, value) -> value + 1);
            }
        }

        //가장 큰 값의 Key 찾기
        String maxKey = "";
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            int value = entry.getValue();

            if (value > max) {
                max = value;
                maxKey = entry.getKey();
                count = 1;
            } else if (value == max) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println("?");
        } else {
            System.out.println(maxKey);
        }

    }
}