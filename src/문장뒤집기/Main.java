package 문장뒤집기;

import java.util.Scanner;

public class Main {

    public void solution(String[] arr) {
//        StringBuffer의 revesrs()를 이용한 방법
//        for (String str : arr) {
//            StringBuffer b = new StringBuffer(str);
//            System.out.println(b.reverse().toString());
//        }
//        직접하기 - 1
//        for (String str : arr ) {
//            char[] cArr = str.toCharArray();
//            for (int i = 0; i < str.length()/2; i++) {
//                char tmp = str.charAt(i);
//                cArr[i] = cArr[(str.length()-1)-i];
//                cArr[(str.length()-1)-i] = tmp;
//
//            }
//            System.out.println(cArr);
//        }
//        직접하기 - 2
        for (String str : arr) {
            char[] cArr = str.toCharArray();
            int lt = 0, rt = str.length() - 1;
            while (lt < rt) {
                char tmp = cArr[lt];
                cArr[lt] = cArr[rt];
                cArr[rt] = tmp;
                lt++;
                rt--;
            }
            System.out.println(cArr);
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
