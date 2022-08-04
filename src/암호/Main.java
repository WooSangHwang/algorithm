package 암호;

import java.util.Scanner;

public class Main {

    public String solution(int cnt, String enc) {

        String answer = "";
        enc = enc.replaceAll("#", "1").replaceAll("\\*", "0");
//
//        for (int i = 0; i < cnt; i++) {
//            System.out.println(enc.substring(i * 7, (i + 1) * 7));
//            String tmp = enc.substring(i * 7, (i+1)*7);
//            int sum = 0;
//            for (int j = 6; j >= 0; j--) {
//                sum += (Integer.parseInt(String.valueOf(tmp.charAt(j)))) * (Math.pow(2, (6 - j)));
//            }
////            System.out.println(sum);
//            answer += String.valueOf(Character.toChars(sum));
//
//        }
//        System.out.println(Character.toChars(Integer.parseInt(enc.substring(0, 7), 2)));
//        System.out.println(Integer.parseInt(enc.substring(7, 14), 2));
//        System.out.println(Integer.parseInt(enc.substring(14, 21), 2));
//        System.out.println(enc.substring(7, 14));
//        System.out.println(enc.substring(14, 21));
//        System.out.println(enc.substring(21, 28));

        for (int i = 0; i < cnt; i++) {
//            System.out.println(enc.substring(i * 7, (i+1)*7));
            int sum = Integer.parseInt(enc.substring(i * 7, (i + 1) * 7), 2);
            answer += String.valueOf(Character.toChars(sum));

        }

        //1011
        //   8021 11

        return answer;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        String enc = s.next();
        System.out.println(t.solution(cnt, enc));

    }

}
