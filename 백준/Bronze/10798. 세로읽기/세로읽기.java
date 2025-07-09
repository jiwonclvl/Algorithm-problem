import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        int row = 5;

        String[] arr = new String[row];
        int maxLength = 0;
        for (int i = 0; i < row; i++) {
            String str = sc.nextLine();

            if (str.length() > maxLength) {
                maxLength = str.length();
            }

            arr[i] = str;
        }

        for (int j = 0; j < maxLength; j++) {
            for (int k = 0; k < row; k++) {
                String s = arr[k];

                if (j >= s.length()) {
                    continue;
                }

                String vlaue = Character.toString(s.charAt(j));
                result.append(vlaue);
            }
        }

        System.out.println(result);
    }
}