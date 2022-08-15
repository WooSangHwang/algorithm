package 봉우리;

import java.util.Scanner;

public class Main {

    public int solution(int cnt, int[][] arr) {
        int answer = 0;
//        방법 1
//        for (int i = 1; i <= cnt; i++) {
//            for (int j = 1; j <= cnt; j++) {
//                int colMax = 0;
//                int rowMax = 0;
//                int max = 0;
//                colMax = Math.max(arr[i - 1][j], arr[i + 1][j]);
//                rowMax = Math.max(arr[i][j - 1], arr[i][j + 1]);
//                max = Math.max(colMax, rowMax);
//                if (arr[i][j] > max) {
//                    answer++;
//                }
//            }
//        }
        // 방법 2 방향을 배열로 저장한다.
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for (int i = 1; i <= cnt; i++) {
            for (int j = 1; j <= cnt; j++) {
                boolean flag = true;
                for (int k = 0; k < dx.length; k++) {
                    if (arr[i][j] <= arr[i + dx[k]][j + dy[k]]) {
                        flag = false;
                    }
                }
                if (flag) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        int[][] arr = new int[cnt + 2][cnt + 2];
        for (int i = 1; i <= cnt; i++) {
            for (int j = 1; j <= cnt; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println(t.solution(cnt, arr));
//        System.out.println("");
//
//        for (int i = 0; i < cnt +2; i++) {
//            for (int j = 0; j < cnt +2; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println("");
//
//        }

    }
}

//        0 0 0 0 0 0
//        0 5 3 7 2 0
//        0 3 3 7 1 0
//        0 6 1 7 2 0
//        0 5 3 4 4 0
//        0 0 0 0 0 0
