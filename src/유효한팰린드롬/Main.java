package 유효한팰린드롬;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public String solution(String str) {

        String answser = "YES";
        str = str.toLowerCase().replaceAll("[^a-z]","");

        for (int j = 0; j < str.length() / 2; j++) {
//                System.out.println(strArr[i].charAt(j));
//                System.out.println(strArr[strArr.length - 1 - i].charAt(strArr[i].length() -1 - j));
            if (str.charAt(j) != str.charAt(str.length() - 1 - j)) {
                answser = "NO";
            }
        }
//        String reverseStr = new StringBuilder(str).reverse().toString();
//        if (!str.equals(reverseStr)) {
//            anwser = "NO";
//        }

        //StringBuiler(str).rev

        return answser;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(t.solution(str));

    }

}
