import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        boolean foundMin = false;
        int resultSum = 0;
        int resultMin = 0;

        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                if (!foundMin) {
                    resultMin = num;
                    foundMin = true;
                }
                resultSum += num;
            }
        }

        if (resultSum == 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(resultSum);
        System.out.println(resultMin);
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int j = 3; j * j <= num; j += 2) {
            if (num % j == 0) {
                return false;
            }
        }

        return true;
    }
}