import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> basket = new ArrayList<>();
        int temp = 0;

        int n = sc.nextInt();
        int m = sc.nextInt();

        //바구니 초기 세팅
        for (int i = 1; i <= n; i++) {
            basket.add(i);
        }

        for (int j = 0; j < m; j++) {
            int bk1 = sc.nextInt();
            int bk2 = sc.nextInt();

            Collections.reverse(basket.subList(bk1 - 1, bk2));
        }

        for (Integer num : basket) {
            System.out.print(num + " ");
        }
    }
}