
import java.util.Arrays;
import java.util.Scanner;

public class Q1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.trim();

        String[] arr = input.split(" ");

        if(arr.length == 1 && arr[0].isBlank()) {
            System.out.println(0);
        } else {
            System.out.println(arr.length);
        }
        //System.out.println(Arrays.toString(arr));


    }
}
