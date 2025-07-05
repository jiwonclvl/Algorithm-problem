import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0.0;
        double average = 0.0;
        double totalGrade = 0.0;
        int num = 20;

        for (int i = 0; i < num; i++) {
            String subject  = sc.nextLine();

            String[] subjectList = subject .split(" ");
            Double gpa = Double.parseDouble(subjectList[1]);
            String grade = subjectList[2];

            if ("P".equals(grade)) {
                continue;
            }

            totalGrade += gpa;

            switch(grade) {
                case "A+":
                    result += 4.5 * gpa;
                    break;
                case "A0":
                    result += 4.0 * gpa;
                    break;
                case "B+":
                    result += 3.5 * gpa;
                    break;
                case "B0":
                    result += 3.0 * gpa;
                    break;
                case "C+":
                    result += 2.5 * gpa;
                    break;
                case "C0":
                    result += 2.0 * gpa;
                    break;
                case "D+":
                    result += 1.5 * gpa;
                    break;
                case "D0":
                    result += 1.0 * gpa;
                    break;
                case "F":
                    result += 0.0 * gpa;
                    break;
            }

            average = result /totalGrade;
        }

        System.out.printf("%.6f", average);
    }
}

