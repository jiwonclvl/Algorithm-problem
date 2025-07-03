import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        List<String> Croatia = new ArrayList<>();
        Croatia.add("dz=");
        Croatia.add("c=");
        Croatia.add("c-");
        Croatia.add("d-");
        Croatia.add("lj");
        Croatia.add("nj");
        Croatia.add("s=");
        Croatia.add("z=");

        String input = sc.next();

        for (String st : Croatia) {
            if (input.contains(st)) {
                input = input.replace(st, "*");
            }
        }

        for (String st : input.split("")) {
            result ++;
        }

        System.out.print(result);
    }
}