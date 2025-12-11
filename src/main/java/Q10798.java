import java.util.Scanner;

public class Q10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] puzzle = new String[5][15];

        for (int i = 0; i < 5; i++) {
            String input = sc.next();
            String[] arr = input.split("");
            int j = 0;
            for (String str : arr) {
                puzzle[i][j] = str;
                j++;
            }
        }

        calc(puzzle);

    }

    static void calc(String[][] puzzle) {
        String result = "";
        for (int i = 0; i < puzzle[0].length; i++) {
            for (int j = 0; j < puzzle.length; j++) {
                if (puzzle[j][i] != null) {
                    result += puzzle[j][i];
                } else if (puzzle[j][i] == null) {
                    result += "";
                }
            }
        }
        System.out.println(result);
    }
}
