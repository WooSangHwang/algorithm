package 중복문자제거;

import java.util.Scanner;

public class Main {
    public String solution(String str) {

        String anwer = "";
        for (char c : str.toCharArray()) {
//            System.out.println(anwer.indexOf(String.valueOf(c)) != -1);
//            System.out.println(anwer);
//            방법 1
//            if (anwer.indexOf(String.valueOf(c)) == -1) {
//                anwer += String.valueOf(c);
//            }
        }
//        방법2
        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(str.charAt(i)) == i) {
                anwer += str.charAt(i);
            }
        }

        return anwer;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner s = new Scanner(System.in);
        String str = s.next();

        System.out.println(t.solution(str));

    }
}
