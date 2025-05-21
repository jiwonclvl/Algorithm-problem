
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        int hundredsPlace = (input2/100);
        int tensPlace = (input2/10) % 10;
        int onesPlace = input2 % 10;

        System.out.println(input1 * onesPlace);
        System.out.println(input1 * tensPlace);
        System.out.println(input1 * hundredsPlace);
        System.out.println(input1 * input2);
    }
}