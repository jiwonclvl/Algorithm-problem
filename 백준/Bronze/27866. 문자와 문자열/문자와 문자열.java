import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();
        int index = sc.nextInt();

        System.out.print(st.charAt(index -1));
    }
}