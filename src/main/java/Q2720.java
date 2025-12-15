import java.util.Scanner;

public class Q2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();

        for (int i = 0; i < inputNum; i++) {
            int change = sc.nextInt();

            calChange(change);
        }
    }


    //0.25 0.10, 0.05, 0.01
    static void calChange(int change) {
        int quarter =  (change / 25);
        int dime =  (change%25 / 10);
        int nickel =  (change% 25 % 10 / 5);
        int penny =  (change % 25 % 10 % 5);


        System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
    }
}
