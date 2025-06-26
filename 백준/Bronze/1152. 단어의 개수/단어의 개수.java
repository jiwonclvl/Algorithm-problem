import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        String str = sc.nextLine();

        for (String s : str.split(" ")) {
            if ("".equals(s)) {
                continue;
            }
            result ++;
        }

        System.out.print(result);
    }
}