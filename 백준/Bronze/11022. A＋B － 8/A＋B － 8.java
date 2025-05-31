    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            List<String> problemList = new ArrayList<>();
            List<Integer> answerList = new ArrayList<>();
            int number = 0;

            int t = sc.nextInt();

            for (int i = 0; i < t; i++) {
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                problemList.add(String.format("%d + %d", num1, num2));
                answerList.add(num1 + num2);
            }

            for (int i = 0; i < t ; i++) {
                number += 1;
                System.out.printf("Case #%d: %s = %d\n",number, problemList.get(i), answerList.get(i));

            }
        }
    }