import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> basket = new ArrayList<>();

        int n = sc.nextInt(); //바구니
        int m = sc.nextInt(); //공을 넣을 횟수

        for (int k = 0; k < n; k++) {
            basket.add(0);
        }

        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int ball = sc.nextInt();

            for (int j = start - 1; j <= end - 1; j++) {
                basket.set(j, ball);
            }
        }

        for (Integer num : basket) {
            System.out.print(num + " ");
        }
    }
}