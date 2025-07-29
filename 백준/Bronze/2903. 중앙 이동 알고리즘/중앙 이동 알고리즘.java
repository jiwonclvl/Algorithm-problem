import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int result = 2;
        int pow = 1;
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            result = (result + pow);
            pow = pow * 2;
        }

        System.out.print(result * result);
    }
}