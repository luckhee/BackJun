import java.util.ArrayList;
import java.util.Scanner;

class TestCase {
    int num;
    String str;

    public TestCase(int num, String str) {
        this.num = num;
        this.str = str;
    }
}

public class Q2675 {
    static ArrayList<TestCase> arr = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int TC = sc.nextInt();

        for (int i = 0; i < TC; i++) {
            int n = sc.nextInt();
            String s = sc.next();

            TestCase testCase = new TestCase(n,s);

            arr.add(testCase);
        }

        for(TestCase x : arr){
            String[] splitStr = x.str.split("");
            for(String y : splitStr) {
                for (int i = 0; i < x.num; i++) {
                    System.out.print(y);
                }
            }
            System.out.println();
        }

    }
}
