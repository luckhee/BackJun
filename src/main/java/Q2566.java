import java.util.Scanner;

public class Q2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        findMaxNum(arr);
    }

    static void findMaxNum(int[][] arr) {
        int result = Integer.MIN_VALUE;
        int col = 0;
        int row = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(result < arr[i][j]){
                    result = arr[i][j];
                    col = i+1;
                    row = j+1;
                }
            }
        }

        System.out.println(result);
        System.out.println(col + " " + row);
    }

}
