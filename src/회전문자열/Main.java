package 회전문자열;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public String solution(String str) {

        String lowerStr = str.toLowerCase();
        String answer = "YES";
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if (lowerStr.charAt(lt) != lowerStr.charAt(rt)) {
                answer = "NO";
            }
            lt++;
            rt--;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(t.solution(str));

    }

}
