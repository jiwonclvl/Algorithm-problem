
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> resultList = new ArrayList<>();

        while (true) {
            try {
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                resultList.add(num1 + num2);

            } catch (Exception e) {
                break;
            }
        }

        for (Integer result : resultList) {
            System.out.println(result);
        }

    }
}
