package 소수2;

import java.util.ArrayList;
import java.util.Scanner;

//에라토스테네스의 체  // 배수로 숫자를 지워서 소수를 찾아낸다.
public class Main {
    public int solution(int cnt) {
        int answer = 0;

        int[] arr = new int[cnt + 1];
        for (int i = 2; i <= cnt; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j = i; j <= cnt; j =j+i) {
                    arr[j] = 1;
                }
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
