import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();

        if (min - 45 == 0) {
            System.out.println(hour + " " + 0);
        }
        if (min - 45 < 0) {
            hour --;

            if (hour == -1) {
                System.out.println("23 " + (60 + (min - 45)));
            }
            else {
                System.out.println(hour + " " + (60 + (min - 45)));
            }
        }
        if (min - 45 > 0) {
            System.out.println(hour + " " + (min - 45));
        }
    }
}
