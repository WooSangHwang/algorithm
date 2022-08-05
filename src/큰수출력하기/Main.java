package 큰수출력하기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public String solution(int c, String str) {

        String answer = "";
        str = "0 " + str;
        String[] strArr = str.split(" ");

        for (int i = 1; i < strArr.length; i++) {
            if (Integer.parseInt(strArr[i-1]) < Integer.parseInt(strArr[i])) {
                answer += strArr[i] + " ";
            }
        }


        return answer;

    }

    public List<Integer> solution2(int c, int[] intArr) {
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(intArr[0]);
        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] > intArr[i - 1]) {
                arrayList.add(intArr[i]);
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        int[] intArr = new int[c];
        for (int i = 0; i <intArr.length; i++) {
            intArr[i] = s.nextInt();
        }
//        for (int i : intArr) {
//            System.out.println(i);
//        }
//        s.nextLine();
//        String str = s.nextLine();
//        System.out.println(t.solution(c, str));
        for (int i : t.solution2(c, intArr)) {
            System.out.print(i + " ");
        }
//        System.out.println(t.solution2(c, intArr));

    }
}
