package 숫자만추출;

import java.util.Scanner;

public class Main {

    public int solution(String str) {
        int answer = 0;
//        1안
//        str = str.replaceAll("[^0-9]", "");
//        answer = Integer.parseInt(str);
//        2안
        for (char c : str.toCharArray()) {
//            Character.isDefined(c) // 문자가 숫지인지 판별하는 메서드.
            if (48 <= c && c <= 57) {
                answer = answer * 10 + (c - 48);
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
