import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        
        for (int i = 0; i < 9; i++) {
            int num = sc.nextInt();
            nums.add(num);
        }
        
        int max = Collections.max(nums);
        int index = nums.indexOf(max);
        
        System.out.println(max);
        System.out.println(index + 1);
    }
}