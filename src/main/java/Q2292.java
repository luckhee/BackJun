import java.util.Scanner;

public class Q2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //6개씩 증가 .. 6의 배수 ...
        //2 - 7까지 1층(5), 8 - 19까지 2층(11) , 20 부터 37까지 3층(17)
        int layer = 1;
        int input = sc.nextInt();

        int endPoint = 1;

        while (input > endPoint) {

            endPoint = endPoint + 6 * layer;
            layer++;
        }

        System.out.println(layer);
    }
}
