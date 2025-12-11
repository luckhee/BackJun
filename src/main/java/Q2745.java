import java.util.ArrayList;
import java.util.Scanner;

public class Q2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputString = sc.next();
        int inputNum = sc.nextInt();

        Long result = 0L;

        ArrayList<Integer> changeStr = new ArrayList<>();

        for (char ch : inputString.toCharArray()) {
            if(Character.isDigit(ch)) {
                changeStr.add((int) ch - 48);
            } else {
                changeStr.add((int) ch - 55);
            }

        }


        for (int j = 0; j < changeStr.size(); j++) {
            result += changeStr.get(changeStr.size() - 1 - j) * (long) Math.pow(inputNum, j);
        }

        System.out.println(result);
    }
}
