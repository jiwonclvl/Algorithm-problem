import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i <n ; i++) {
            int num = sc.nextInt();

            numList.add(num);
        }

        int v = sc.nextInt();

        int result = Collections.frequency(numList, v);

        System.out.println(result);
    }
}