import java.util.Scanner;

import static java.lang.Math.max;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //주사위 눈
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        //눈이 모두 같은 경우
        if (num1 == num2 && num2 == num3) {
            System.out.println(10000 + num1 * 1000);
        } else {
            //눈이 2개만 같은 경우
            if (num1 == num2) {
                System.out.println(1000 + num1 * 100);
            }
            if (num2 == num3) {
                System.out.println(1000 + num2 * 100);
            }
            if (num1 == num3) {
                System.out.println(1000 + num1 * 100);
            }
        }

        //눈이 모두 다른 경우
        if (num1 != num2 && num2 != num3 && num1 != num3) {
            int max1 = max(num1, num2);
            int maxNum = max(max1, num3);
            System.out.println(maxNum * 100);
        }
    }
}
