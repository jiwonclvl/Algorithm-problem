import java.util.*;

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String result = "";

        for (int i = 0; i < num; i++) {
            int repeat = sc.nextInt();
            String str = sc.next();

            for (String s : str.split("")) {
                result += s.repeat(repeat);
            }
            System.out.println(result);
            result = "";
        }
    }
}