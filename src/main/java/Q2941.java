import java.util.Scanner;

public class Q2941 {
    public static void main(String[] args) {
        // c= c- dz= d- lj nj s= z= 크로아티아 알파벳

        // 컨테인 함수 쓰면..?

        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String input = sc.next();



        int idx = 0;



        while(!input.isBlank()) {
            String key = "";
            if (input.contains("c=")) key = "c=";
            else if (input.contains("c-")) key = "c-";
            else if (input.contains("dz=")) key = "dz=";
            else if (input.contains("d-")) key = "d-";
            else if (input.contains("lj")) key = "lj";
            else if (input.contains("nj")) key = "nj";
            else if (input.contains("s=")) key = "s=";
            else if (input.contains("z=")) key = "z=";


            switch (key) {
                case "c=":
                    cnt++;
                    idx = input.indexOf("c=");
                    input = input.replaceFirst("c=", " ");
                    break;

                case "c-":
                    cnt++;
                    idx = input.indexOf("c-");
                    input = input.replaceFirst("c-", " ");
                    break;

                case "dz=":
                    cnt++;
                    idx = input.indexOf("dz=");
                    input = input.replaceFirst("dz=", " ");
                    break;

                case "d-":
                    cnt++;
                    idx = input.indexOf("d-");
                    input = input.replaceFirst("d-", " ");
                    break;

                case "lj":
                    cnt++;
                    idx = input.indexOf("lj");
                    input = input.replaceFirst("lj", " ");
                    break;

                case "nj":
                    cnt++;
                    idx = input.indexOf("nj");
                    input = input.replaceFirst("nj", " ");
                    break;

                case "s=":
                    cnt++;
                    idx = input.indexOf("s=");
                    input = input.replaceFirst("s=", " ");
                    break;

                case "z=":
                    cnt++;
                    idx = input.indexOf("z=");
                    input = input.replaceFirst("z=", " ");
                    break;

                default:
                    // 아무 패턴도 없으면 한 글자 소비

                    input = input.replaceAll(" ","");
                    cnt+= input.length();
                    input= "";
                    break;
            }
        }


        System.out.println(cnt);

    }
}
