import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> basket = new ArrayList<>();

        int n = sc.nextInt();
        int m = sc.nextInt();

        //바구니 초기 세팅
        for (int i = 1; i <= n; i++) {
            basket.add(i);
        }

        //공 바꾸기
        for (int j = 0; j < m; j++) {
            int bk1 = sc.nextInt();
            int bk2 = sc.nextInt();

            int bkNum1 = basket.get(bk2 - 1);
            int bkNum2 = basket.get(bk1 - 1);

            basket.set(bk1 -1, bkNum1);
            basket.set(bk2 -1, bkNum2);
        }

        for (Integer result: basket) {
            System.out.print(result + " ");
        }
    }
}