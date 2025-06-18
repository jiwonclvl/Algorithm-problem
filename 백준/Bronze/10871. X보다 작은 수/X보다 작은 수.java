import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        int n = sc.nextInt();
        int x = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            nums.add(num);
        }
        
        for (Integer num : nums) {
            if (num < x) {
                System.out.print(num + " ");
            } 
        }
    } 
}
