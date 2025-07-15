import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = 0;

        String number = sc.next();
        int numberSystem = sc.nextInt();

        int digit = number.length() - 1;
        int power = 1;
        for (int i = 0; i < number.length(); i++) {
            int num = (int) number.charAt(digit);

            if (num >= 65) {
                num -= 55;
            } else {
                num -= 48;
            }
            
            decimal += num * power;
            digit--;
            power *= numberSystem;
        }

        System.out.print(decimal);
    }
}