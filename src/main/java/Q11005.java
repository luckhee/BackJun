import java.util.Scanner;

public class Q11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int base =sc.nextInt();
        String result = "";
        while(n > 0) {
            char m = (char) (n % base);
            n = n / base;
            if(Character.isDigit(m +'0')){
                //System.out.print((char)(m + '0'));
                result +=(char)(m+'0');
            } else {
                //System.out.print((char)(m +'A'-10));
                result +=(char)(m+'A'-10);
            }

        }

        char[] reverseResult = result.toCharArray();
        for (int i = result.length()-1; i >= 0 ; i--) {
            System.out.print(reverseResult[i]);
        }


    }
}
