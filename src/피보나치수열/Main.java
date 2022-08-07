package 피보나치수열;

import java.util.Scanner;

public class Main {

    public void solution(int cnt) {

        int answer[] = new int[cnt];
        int first = 1;
        int second = 1;
        int result = 0;
        System.out.print(first + " " + second + " ");

        for (int i = 2; i < cnt; i++) {
            result = first + second;
            System.out.print(result + " " );
            first = second;
            second = result;

        }

//        answer[0] = 1;
//        answer[1] = 1;
//
//        for (int i = 2; i < cnt; i++) {
//            answer[i] = answer[i-1] + answer[i-2];
//        }


//        return answer;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
//        for (int i : t.solution(cnt)) {
//            System.out.print(i + " ");
//        }
        t.solution(cnt);
    }
}
