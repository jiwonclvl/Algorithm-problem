import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> resultList = new ArrayList<>();

        while (true) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if (num1 == 0 && num2 == 0) {
                break;
            }

            resultList.add(num1 + num2);
        }

        for (Integer result : resultList) {
            System.out.println(result);
        }

    }
}
