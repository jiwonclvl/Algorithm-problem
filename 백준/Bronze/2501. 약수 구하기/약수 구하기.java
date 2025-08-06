import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> divisors = new ArrayList<>();

        int num = sc.nextInt();
        int k = sc.nextInt();

        int n = (int) Math.sqrt((double) num);

        for (int i = 1; i <= n; i++) {
            if (num % i == 0) {
                divisors.add(i);

                if (num / i == i ) {
                    continue;
                }

                divisors.add(num / i);
            }
        }

        if (divisors.size() < k ) {
            System.out.println(0);
            return;
        }

        Collections.sort(divisors);
        System.out.println(divisors.get(k - 1));

    }
}