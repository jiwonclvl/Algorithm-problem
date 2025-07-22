import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int change = sc.nextInt();
            int quarter = 0;
            int dime = 0;
            int nickel = 0;
            int penny = 0;
            int result = change;

            quarter = result / 25;
            result = result % 25;

            dime = result / 10;
            result = result % 10;

            nickel = result / 5;
            penny = result % 5;

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}
