package 뒤집은소수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public List<Integer> solution(int cnt, String[] strArr) {
        List<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i < cnt; i++) {
            int tmp = Integer.parseInt(new StringBuffer(strArr[i]).reverse().toString());
            int sqrtCnt = 0;
            for (int j = 1; j <= Math.sqrt(tmp); j++) {
                if (tmp % j == 0 && tmp > 1) {
                    sqrtCnt++;
                }
            }
            if (sqrtCnt == 1) {
                answer.add(tmp);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        String[] strArr = new String[cnt];
        for (int i = 0; i < cnt; i++) {
            strArr[i] = s.next();
//            System.out.println(strArr[i]);
        }
        for (int i : t.solution(cnt, strArr)) {
            System.out.print(i + " ");
        }
    }
}
