import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> studentList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int totalStudent = 30;
        int submittedStudent = 28;

        //전체 수강 명부
        for (int i = 0; i < totalStudent; i++) {
            studentList.add(i + 1);
        }

        //과제 제출자 명부
        for (int i = 0; i < submittedStudent; i++) {
            int student = sc.nextInt();
            result.add(student);
        }

        studentList.stream()
                .filter(student -> result.stream()
                        .noneMatch(Predicate.isEqual(student))
                )
                .sorted()
                .forEach(System.out::println);
    }
}