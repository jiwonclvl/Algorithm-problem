import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> grades = new ArrayList<>();
        double result = 0;

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int grade = sc.nextInt();
            grades.add(grade);
        }

        int max = Collections.max(grades);

        for (Integer grade : grades) {
            double newGrade = (double) grade / max * 100;

            result += newGrade;
        }

        System.out.printf("%.6f", result/n);
    }
}