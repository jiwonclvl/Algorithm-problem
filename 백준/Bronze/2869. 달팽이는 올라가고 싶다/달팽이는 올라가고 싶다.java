import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();

        int day = (int) (Math.ceil((double) (v - a) / (a-b)) + 1);
        System.out.print(day);
    }
}