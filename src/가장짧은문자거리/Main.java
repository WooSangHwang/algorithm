package 가장짧은문자거리;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int[] solution(String str) {
        String[] strArr = str.split(" ");
        str = strArr[0].replaceAll("\\s", "");;
        String targetChar = strArr[1];
        int size = str.length();
        int[] answer = new int[size];
//        내가 풀었던 방법..
//        for (int i = 0; i < size; i++) {
//            answer[i] = 999;
//            for (int j = 0; j < size; j++) {
//                if(str.charAt(j) == targetChar.charAt(0)) {
//                    if(answer[i] > Math.abs(i - j)) {
//                        answer[i] = Math.abs(i - j);
//                    }
//                }
//            }
//
//        }
//        인프런 강의 지도 방법.
        int p = 999;
        for (int i = 0; i < size; i++) {

            if(str.charAt(i) != targetChar.charAt(0)) {
                p++;
            } else {
                p = 0;
            }
            answer[i] = p;

        }
        for (int i = size -1; i >= 0; i--) {
            if(str.charAt(i) != targetChar.charAt(0)) {
                p++;
            } else {
                p = 0;
            }
            if(answer[i] > p) {
                answer[i] = p;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main m = new Main();
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        for (int i : m.solution(str)) {
            System.out.print(i + " ");
        }


    }


}
