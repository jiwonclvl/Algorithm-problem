import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int column = sc.nextInt();

        int [][] a = createMatrix(row, column, sc);
        int [][] b = createMatrix(row, column, sc);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j ++){
                int valueA = a[i][j];
                int valueB = b[i][j];

                System.out.print(valueA + valueB + " ");
            }

            System.out.println();
        }

    }

    public static int [][] createMatrix(int row,int column, Scanner sc) {
        int [][] matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int value = sc.nextInt();
                matrix[i][j] = value;
            }
        }

        return matrix;
    }
}