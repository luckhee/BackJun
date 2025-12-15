import java.util.Scanner;

public class Q1193 {
    public static void main(String[] args) {
        //k번째 대각선에 k개의 분수가 있음  k(k+1)/2
        // input이 13이야 그러면 5번째 대각선 안에 13번째 항이 있다는 이야기
        // 포지션은 13 - (5-1)5/2 = 3번째 에 있다는거 분자 분모를 구하려면
        // 분자는 pos 분모는 5 - 3 + 1
        // k가 몇번째 대각선인지

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int line = 0;

        int k = 0;

        while (k * (k + 1) / 2 < input) {
            k++;
        }
        line = k;

        int pos = input - (line - 1) * line / 2;

        int numerator;
        int denominator;

        // 대각선 방향: line이 짝수면 위->아래(분자 증가), 홀수면 아래->위(분모 증가)
        if (line % 2 == 0) {
            numerator = pos;
            denominator = line - pos + 1;
        } else {
            numerator = line - pos + 1;
            denominator = pos;
        }

        System.out.println(numerator + "/" + denominator);


    }
}
