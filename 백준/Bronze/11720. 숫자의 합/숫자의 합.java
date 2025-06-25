import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        int num = sc.nextInt();
        String number = sc.next();

        for (String st :number.split("")) {
            result += Integer.parseInt(st);
        }

        System.out.print(result);
    }
}