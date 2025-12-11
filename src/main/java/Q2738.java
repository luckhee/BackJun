import java.util.Arrays;
import java.util.Scanner;

public class Q2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrixA = new int[row][col];
        int[][] matrixB = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        int[][] result = cal(matrixA, matrixB, col, row);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }



    }

    static int[][] cal(int[][] matrixA, int[][] matrixB, int col, int row) {
        int[][] result = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }

        }

        return result;
    }

}
