import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Q25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] informs= new String[20];
        for (int i = 0; i < 20; i++) {
            String input = sc.nextLine();
            informs[i] = input;
        }
        System.out.println(calc(informs));
    }

    static double calc(String[] informs) {
        double sumGrade = 0.0;
        double result = 0.0;

        ArrayList<Double> grade = new ArrayList<>();
        ArrayList<String> degree = new ArrayList<>();

        for(String inform : informs) {
            String[] splitInform = inform.split(" ");
            grade.add(Double.parseDouble(splitInform[1]));
            degree.add(splitInform[2]);
        }

        ArrayList<Double> changeDegree = changeDegree(degree);

        for (int i = 0; i < 20; i++) {
            if(changeDegree.get(i)!= null) {
                sumGrade += grade.get(i);
                result += changeDegree.get(i) * grade.get(i);
            }
        }

        return result / sumGrade;
    }

    private static ArrayList<Double> changeDegree(ArrayList<String> degree) {
        HashMap<String, Double> std = new HashMap<>();
        std.put("A+",4.5);
        std.put("A0",4.0);
        std.put("B+",3.5);
        std.put("B0",3.0);
        std.put("C+",2.5);
        std.put("C0",2.0);
        std.put("D+",1.5);
        std.put("D0",1.0);
        std.put("F",0.0);
        std.put("P",null);


        ArrayList<Double> changeDegree = new ArrayList<>();

        for (int i = 0; i < degree.size(); i++) {
            if(std.containsKey(degree.get(i))) changeDegree.add(std.get(degree.get(i)));
        }

        return changeDegree;
    }
}
