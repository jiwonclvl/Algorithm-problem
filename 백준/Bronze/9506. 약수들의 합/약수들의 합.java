import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();

            if (num == -1) {
                break;
            }

            System.out.println(checkAndFormatPerfectNumber(num));
        }
    }

    public static String checkAndFormatPerfectNumber(int num) {
        List<Integer> divisors = new ArrayList<>();
        int n = (int) Math.sqrt((double) num);
        int result = 0;
        String notPerfectNumFormat = num + " is NOT perfect.";

        if (num == 1) {
            return notPerfectNumFormat;
        }

        for (int i = 1; i <= n; i++) {
            if (num % i == 0) {
                divisors.add(i);
                result += i;

                if (num / i == i) {
                    continue;
                }

                if (num == num / i) {
                    continue;
                }

                divisors.add(num / i);
                result += num / i;
            }
        }

        if (result != num) {
            return notPerfectNumFormat;
        }

        Collections.sort(divisors);
        StringBuilder perfectNum = new StringBuilder();
        perfectNum.append(num).append(" = ");

        for (Integer divisor : divisors) {
            if (divisor.equals(divisors.get(divisors.size() - 1))) {
                perfectNum.append(divisor);
            } else {
                perfectNum.append(divisor).append(" + ");
            }
        }

        return perfectNum.toString();
    }
}