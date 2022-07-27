package 대소문자변환;

import java.util.Scanner;

public class Main {

    public String solution(String str) {

        String answer = "";
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                answer += Character.toUpperCase(c);
            } else {
                answer += Character.toLowerCase(c);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main t = new Main();
        Scanner s = new Scanner(System.in);
        String str  = s.next();
        System.out.println(t.solution(str));
    }


}
