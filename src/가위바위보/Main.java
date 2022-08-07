package 가위바위보;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public char[] solution(int cnt, int[] aArr, int[] bArr) {

        char[] answer = new char[cnt];

        for (int i = 0; i < cnt; i++) {
//            내가 만든 방법
//            int result = aArr[i] - bArr[i];
//
//            if (result == 2) {
//                answer[i] = 'B';
//            } else if (result == -2) {
//                answer[i] = 'A';
//            } else if (result > 0) {
//                answer[i] = 'A';
//            } else if (result < 0) {
//                answer[i] = 'B';
//            } else {
//                answer[i] = 'D';
//            }
//            인프런 방법 (대상 하나를 고정적으로 계산.
            if (aArr[i] == bArr[i]) {
                answer[i] = 'D';
            } else if (aArr[i] == 1 && bArr[i] == 3) {
                answer[i] = 'A';
            } else if (aArr[i] == 2 && bArr[i] == 1) {
                answer[i] = 'A';
            } else if (aArr[i] == 3 && bArr[i] == 2) {
                answer[i] = 'A';
            } else {
                answer[i] = 'B';
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        int[] aArr = new int[cnt];
        int[] bArr = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            aArr[i] = s.nextInt();
        }
        for (int i = 0; i < cnt; i++) {
            bArr[i] = s.nextInt();
        }
        for (char c : t.solution(cnt, aArr, bArr)) {
            System.out.println(c);
        }
    }
}
