package 임시반장정하기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int solution(int cnt, int[][] arr) {
        int answer = 0;
        int tmp = 0;
        int[] tmpAnswer = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < 5; j++) {
                int sum = 0;
                for (int k = 0; k < cnt; k++) {
                    if (arr[i][j] == arr[k][j]) {
                        sum++;
                    }
                }
                tmpAnswer[i] += sum;
            }
            if (tmp < tmpAnswer[i]) {
                tmp = tmpAnswer[i];
                answer = i+1;

            }

        }
        System.out.println("");
        for (int i : tmpAnswer) {
            System.out.print(i + " ");
        }

        return answer;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        int[][] arr = new int[cnt][5];
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println(t.solution(cnt, arr));

    }
}
