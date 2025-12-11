import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
    public int start, end;
    Time(int x, int y){
        this.start =x;
        this.end =y;
    }
    @Override
    public int compareTo(Time o){
        if(this.end ==o.end) return this.start -o.start;
        else return this.end -o.end;
    }
}

public class Q1931 {

    static ArrayList<Time> times;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        times = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int startTime = sc.nextInt();
            int endTime = sc.nextInt();

            Time time = new Time(startTime,endTime);
            times.add(time);
        }

        Collections.sort(times);


        int cnt= 0;
        int end = 0;

            for (int j = 0; j < n; j++) {
                Time t = times.get(j);
                if(t.start >= end) {
                    cnt ++;
                    end = t.end;
                }
            }

        System.out.println(cnt);
    }

}
