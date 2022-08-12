package 격자판최대합;

import java.util.Scanner;

public class Main {
    public int solution(int cnt, int[][] arr) {

        int answer = 0;
        int rDig = 0;
        int lDig = 0;
        int rpnt = cnt;
        for (int i = 0; i < cnt; i++) {
            int col = 0;
            int row = 0;
            rpnt--;
            for (int j = 0; j < cnt; j++) {
                row +=arr[i][j];
                col +=arr[j][i];
                if (i == j) {
                    lDig += arr[i][j];
                }
                if (j == rpnt) {
                    rDig += arr[i][j];
                }
            }
//            System.out.println(col);
//            System.out.println(row);
            int tem = col > row ? col : row;
            answer = answer > tem ? answer : tem;
        }
//        System.out.println(lDig);
//        System.out.println(rDig);

        int dig = lDig > rDig ? lDig : rDig;
        answer = dig > answer ? dig : answer;


        return answer;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        int[][] arr = new int[cnt][cnt];

        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < cnt; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println(t.solution(cnt, arr));

    }
}
