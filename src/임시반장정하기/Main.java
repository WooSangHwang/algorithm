package 임시반장정하기;

import java.util.*;

public class Main {

    public int solution(int cnt, int[][] arr) {
        int answer = 0;
        int size = 0;
        Map<Integer, HashSet<Integer>> map = new HashMap<>();
        for (int i = 0; i < cnt; i++) {
            map.put(i, new HashSet<>());
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < cnt; k++) {
                    if (arr[i][j] == arr[k][j]) {
                        map.get(i).add(k);
                    }
                }
            }
            if (size < map.get(i).size()) {
                size = map.get(i).size();
                answer = i + 1;
            }
        }
//        System.out.println(map);

        return answer;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        int[][] arr = new int[cnt][5];
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println(t.solution(cnt, arr));

    }
}
