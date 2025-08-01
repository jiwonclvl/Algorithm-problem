import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int line = 1;

        while ((line + 1) * line / 2 < num) {
            line++;
        }

        int startLine = ((line - 1) * line / 2) + 1;
        int indexLine = num - startLine;

        if (line % 2 == 0) {

            int first = 1 + indexLine;
            int second = line - indexLine;

            System.out.print(first + "/" + second);
        } else {
            int first = line - indexLine;
            int second = 1 + indexLine;

            System.out.print(first + "/" + second);
        }
    }
}
