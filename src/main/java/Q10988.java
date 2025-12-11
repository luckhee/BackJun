import java.util.Scanner;

public class Q10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        System.out.println(certificatePelindrome(input));
    }


    public static int certificatePelindrome(String input){
        StringBuilder rStart = new StringBuilder();
        String[] arr = input.split("");

        for (int i = input.length()-1; i >= 0; i--) {
            rStart.append(arr[i]);
        }

        return input.contentEquals(rStart) ? 1 : 0;
    }
}
