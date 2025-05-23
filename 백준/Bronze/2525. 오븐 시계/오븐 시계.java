import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                //현재 시간
                int hour = sc.nextInt();
                int min = sc.nextInt();

                //조리 시간
                int time = sc.nextInt();

                //최종 시간
                int result = min + time;
                int resultHour = hour + result/60;
                int resultMin = result % 60;

                if (resultHour > 23) {
                    resultHour = resultHour % 24;
                }

                System.out.println(resultHour + " " + resultMin);

    }
}
