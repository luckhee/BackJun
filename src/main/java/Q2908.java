import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Q2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int mod = 0;

        for (int i = 0; i < 3; i++) {
            int tmp = n % 10; // 마지막 숫자 가져오기
            mod = mod * 10 + tmp;
            n /= 10;

        }

        int nod = 0;
        for (int i = 0; i < 3; i++) {
            int tmp = m % 10; // 마지막 숫자 가져오기
            nod = nod * 10 + tmp;
            m /= 10;
        }

        System.out.println(Math.max(mod,nod));
    }
}
