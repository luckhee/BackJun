import java.util.ArrayList;
import java.util.Scanner;

public class Q1316 {
    static int check(ArrayList<String> arr ){
        int result = 0;
        for(String x : arr) {
            while(!x.isEmpty()) {
                String first = x.substring(0,1);
                x=x.substring(1);
                int idx = x.indexOf(first);
                // 같은 글자가 있다.
                if(idx != -1 && idx != 0) {
                    // 같은 글자가 있으면 idx 비교 뭐랑?
                    break;
                }
            }
            if(x.isEmpty()) result++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String input = sc.next();
            arr.add(input);
        }

        System.out.println(check(arr));

    }

}
