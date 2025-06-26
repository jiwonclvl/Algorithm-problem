import java.util.*;

public class Main {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> alphabetList = new ArrayList<>();
        int num = 97; //'a' 아스키 코드

        //배열 초기 세팅
        for (int i = 0; i < 26; i++) {
            alphabetList.add(-1);
        }

        //a: 97 z: 122
        String st = sc.next();

        for (int j = 0; j < st.length(); j++) {
            char alphabet = st.charAt(j);
            int index = (int) alphabet - num;

            if (alphabetList.get(index) == -1) {
                alphabetList.set(index, j);
            }
        }

        for (Integer i : alphabetList) {
            System.out.print(i + " ");
        }
    }
}