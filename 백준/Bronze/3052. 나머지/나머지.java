import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> result = new HashSet<>();
        int num = 10;
        
        for(int i = 0; i < num; i++) {
            int number = sc.nextInt();
            result.add(number%42);
        }
        
        System.out.print(result.size());
    }
}