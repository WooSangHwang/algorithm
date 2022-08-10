package 점수계산;

import java.util.Scanner;

public class Main {

    public int solution(int[] arr) {

        int answer = 0;
//      방법 1
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i] == 1) {
//                arr[i] = arr[i-1] + arr[i];
//            }
//            answer += arr[i];
//        }
//       방법 2
        int cnt = 0;
        answer = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++;
                answer += cnt;
            } else {
                cnt = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        int[] arr = new int[cnt + 1];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(t.solution(arr));
    }
}
