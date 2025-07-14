import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int area = 0;

        //도화지
        int[][] matrix = new int[100][100];

        //도화지 내 검은 영역 만들기
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int row = x; row < x + 10; row ++) {
                for (int column = y; column < y + 10; column++) {
                    if (matrix[column][row] == 1) {
                        continue;
                    }

                    matrix[column][row] = 1;
                    area ++;
                }
            }
        }

        System.out.println(area);
    }
}

