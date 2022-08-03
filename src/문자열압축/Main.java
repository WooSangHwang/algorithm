package 문자열압축;

import java.util.Scanner;

public class Main {

    public String solution(String str) {

        String answer = "";

//      직접 푼 로직
//        int i= 0;
//        for (i = 0; i < str.length(); i++) {
//            int cnt = 0;
//            for (int j = i; j < str.length(); j++) {
//                if (str.charAt(i) == str.charAt(j)) {
//                    cnt++;
//                } else {
//                    break;
//                }
//            }
//            answer +=  cnt == 1 ? Character.toString(str.charAt(i))  : Character.toString(str.charAt(i)) + cnt;
//            i = i + cnt - 1;
//        }
//        강의 가이드 대로 ..
        str += " ";
        int cnt  = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                answer +=  cnt == 1 ? Character.toString(str.charAt(i))  : Character.toString(str.charAt(i)) + cnt;
                cnt = 1;
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
