import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> resultList = new ArrayList<>();
        int number = 0;

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            resultList.add(num1 + num2);
        }

        for (Integer result : resultList) {
            number += 1;
            System.out.printf("Case #%d: %d\n",number, result);
        }
    }
}