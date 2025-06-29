import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        StringBuilder sb = new StringBuilder(str);
        String newStr = sb.reverse().toString();

        if (str.equals(newStr)) {
            System.out.print(1);

        } else {
            System.out.print(0);
        }

    }
}