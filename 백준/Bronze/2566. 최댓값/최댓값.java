import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 9;
        int column = 9;
        int[][] matrix = new int[row][column];

        //행렬 설정
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int value = sc.nextInt();
                matrix[i][j] = value;
            }
        }

        //최대 값 찾기
        int maxRaw = 0;
        int maxColumn = 0;
        int maxNum = 0;
        for (int k = 0; k < row; k++) {
            for (int n = 0; n < column; n++) {
                if (matrix[k][n] < maxNum) {
                    continue;
                }

                maxNum = matrix[k][n];
                maxColumn = n + 1;
                maxRaw = k + 1;
            }
        }

        System.out.println(maxNum);
        System.out.println(maxRaw + " " + maxColumn);
    }
}