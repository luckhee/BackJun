import java.sql.SQLOutput;
import java.util.*;

public class Q1157 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        input  = input.toUpperCase();
        String[] arr = input.split("");

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i] , 0) +1 );
        }

        int min = Integer.MIN_VALUE;
        String result = " ";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
           if(entry.getValue().equals(min) ) {
               result = "?";
           }
           else if(entry.getValue() > min ) {
               min =  Math.max(entry.getValue(), min);
               result = entry.getKey();
           }
        }

        System.out.println(result);
    }
}
