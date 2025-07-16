import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int decimal = sc.nextInt();
        int numberSystem = sc.nextInt();

        int num = decimal;
        int remainder = 0;
        StringBuilder result = new StringBuilder();
        while(num > 0) {
            remainder = num % numberSystem;
            num = num / numberSystem;

            if (remainder >= 10) {
                result.append((char) (remainder - 10 + 'A'));
            } else {
                result.append(remainder);
            }
        }

        System.out.println(result.reverse());
    }
}