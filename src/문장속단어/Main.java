package 문장속단어;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        for (String s : str.split(" ")) {
            if(answer.length() < s.length()){
                answer = s;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        System.out.println(T.solution(str));


    }
}
