import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>();

        int number = sc.nextInt();

        // 값 입력
        for (int i = 0; i < number; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            numList.add(a + b);
        }

        // 값 출력
        for (Integer num : numList) {
            System.out.println(num);
        }
    }
}
