package 중복문자제거;

import java.util.Scanner;

public class Main {
    public String solution(String str) {

        String answer = "";
        for (char c : str.toCharArray()) {
//            System.out.println(answer.indexOf(String.valueOf(c)) != -1);
//            System.out.println(answer);
//            방법 1
//            if (answer.indexOf(String.valueOf(c)) == -1) {
//                answer += String.valueOf(c);
//            }
        }
//        방법2
        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
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
