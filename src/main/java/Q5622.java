import java.util.HashMap;
import java.util.Scanner;

public class Q5622 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, " ");
        map.put(2, "ABC");
        map.put(3, "DEF");
        map.put(4, "GHI");
        map.put(5, "JKL");
        map.put(6, "MNO");
        map.put(7, "PQRS");
        map.put(8, "TUV");
        map.put(9, "WXYZ");
        map.put(0, "");


        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(cal(str, map));
    }

    public static int cal(String str, HashMap<Integer, String> map) {
        char[] arr = str.toCharArray();
        int result = 0;

        for (char y : arr) {
            for (int j = 0; j < 10; j++) {
                String getStr = map.get(j);
                char[] changeChar = getStr.toCharArray(); // 숫자패드에 있는 알파벳

                for (char z : changeChar) {
                    if(y == z) {
                        result += 1 + j;
                        break;
                    }
                }

            }


        }
        return result;

    }
}
