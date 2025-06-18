import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            result.add(num);
        }
        
        int max = Collections.max(result);
        int min = Collections.min(result);
        
        System.out.print(min + " " + max);
    }
}
