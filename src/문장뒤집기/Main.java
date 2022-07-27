package 문장뒤집기;

import java.util.Scanner;

public class Main {

    public void solution(String[] arr) {

        for (String str : arr) {
            StringBuffer b = new StringBuffer(str);
            System.out.println(b.reverse().toString());
        }
    }


    public static void main(String[] args) {
        Main t = new Main();
        Scanner s = new Scanner(System.in);

        int cnt = s.nextInt();
        String[] arr = new String[cnt];

        for (int i = 0; i < cnt; i++) {
            arr[i] = s.next();
        }

        t.solution(arr);

    }
}
