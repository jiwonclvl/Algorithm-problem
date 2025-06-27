import java.util.*;

public class Main {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> chess = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        int index = 0;

        chess.add(1);
        chess.add(1);
        chess.add(2);
        chess.add(2);
        chess.add(2);
        chess.add(8);

        String input = sc.nextLine();

        for (String s : input.split(" ")) {

            int piece = Integer.parseInt(s);

            if (piece == chess.get(index)) {
                resultList.add(0);
                index ++;
                continue;
            }

            if (piece < chess.get(index)) {
                resultList.add(chess.get(index) - piece);
            }
            else if (piece > chess.get(index)) {
                resultList.add(-(piece - chess.get(index)));
            }

            index ++;
        }

        for (Integer result : resultList) {
            System.out.print(result + " ");
        }
    }
}