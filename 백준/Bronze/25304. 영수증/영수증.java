import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long totalPrice = sc.nextLong();
        int totalQuantity = sc.nextInt();
        long resultPrice = 0;

        for (int i = 0; i < totalQuantity; i++) {
            long price = sc.nextLong();
            int quantity = sc.nextInt();

            resultPrice += price * quantity;
        }

        if (resultPrice == totalPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
