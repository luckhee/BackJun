import java.util.Scanner;

public class Q2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong(); // 올라감
        long B = sc.nextLong(); // 내려감
        long V = sc.nextLong(); // 목표

        // 하루만에 도착
        if (A >= V) {
            System.out.println(1);
            return;
        }

        long perDay = A - B;      // 하루 순증가
        long remain = V - A;      // 마지막 날까지 도달 한 거리

        // 올림 나눗셈: ceil(remain / perDay)
        long daysBeforeLast = (remain + perDay - 1) / perDay;

        System.out.println(daysBeforeLast + 1); // +1은 마지막 날
    }
}
