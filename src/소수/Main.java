package 소수;

import java.util.Scanner;

public class Main {

    public int solution(int cnt) {
        int answer = 0;

        for (int i = 2; i <= cnt; i++) {
            int rt = (int) Math.sqrt(i);
            int c = 0;
            for (int j = 1; j <= rt; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if (c == 1) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        System.out.println(t.solution(cnt));
    }
}
