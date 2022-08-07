package 보이는학생;

import java.util.Scanner;

public class Main {

    public int solution(int[] heights) {

        int answer = 1;
        int maxHeights = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (maxHeights < heights[i]) {
                maxHeights = heights[i];
                answer++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        int[] heights = new int[c];
        for (int i = 0; i < c; i++) {
            heights[i] = s.nextInt();
        }
        System.out.println(t.solution(heights));
    }
}
