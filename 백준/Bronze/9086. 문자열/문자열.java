import java.util.*;

public class Main {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> resultList = new ArrayList<>();

        int totalNum = sc.nextInt();

        for (int i = 0; i < totalNum; i++) {
            String result = sc.next();

            char start = result.charAt(0);
            char end = result.charAt(result.length() - 1);

            resultList.add("" + start + end);
        }

        for (String s : resultList) {
            System.out.println(s);
        }
    }
}