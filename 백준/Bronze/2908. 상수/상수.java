import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = sc.next();
        String num2 = sc.next();

        StringBuilder sb1 = new StringBuilder(num1);
        StringBuilder sb2 = new StringBuilder(num2);


        int newNum1 = Integer.parseInt(sb1.reverse().toString());
        int newNum2 = Integer.parseInt(sb2.reverse().toString());

        if (newNum1 > newNum2) {
            System.out.print(newNum1);
        } else {
            System.out.print(newNum2);
        }
    }
}