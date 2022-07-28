package 특정문자뒤집기;

import java.util.Scanner;

public class Main {

    public String solution(String str) {

        char[] cArr = str.toCharArray();
        int lt = 0, rt = str.length() - 1;


        while (lt < rt) {
            if((65 <= str.charAt(lt) && str.charAt(lt) <= 90) || (97 <= str.charAt(lt) && str.charAt(lt) <= 122)){

                if ((65 <= str.charAt(rt) && str.charAt(rt) <= 90) || (97 <= str.charAt(rt) && str.charAt(rt) <= 122)) {
                    char tmp = cArr[lt];
                    cArr[lt] = cArr[rt];
                    cArr[rt] = tmp;
                    lt++;
                    rt--;
                } else {
                    rt--;
                }
            } else {
                lt++;
            }
        }


        return String.valueOf(cArr);
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner s = new Scanner(System.in);
        String str = s.next();

        System.out.println(t.solution(str));

    }
}
