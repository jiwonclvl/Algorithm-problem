import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            boolean determination = true;
            List<Character> visited = new ArrayList<>();
            String str = sc.next();

            for (int j = 0; j < str.length(); j ++) {
                Character currentValue = str.charAt(j);

                if (j > 0 && currentValue != (Character) str.charAt(j - 1)) {
                    if (Collections.frequency(visited, currentValue) >= 1) {
                        determination = false;
                        break;
                    }
                }

                visited.add(currentValue);
            }

            if (determination) {
                result ++;
            }
        }

        System.out.print(result);
    }
}