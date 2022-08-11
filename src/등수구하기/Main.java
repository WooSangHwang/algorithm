package 등수구하기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public List<Integer> solution(int[] arr) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            int rn = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    rn++;
                }
            }
            list.add(rn);
        }


        return list;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        int[] arr = new int[cnt];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        for (int i : t.solution(arr)) {
            System.out.print(i + " ");
        }

    }
}


//설명
//
//        N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
//
//        같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
//
//        즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
//
//
//        입력
//        첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.
//
//
//        출력
//        입력된 순서대로 등수를 출력한다.
//
//
// 입력 예시
//5
//        87 89 92 100 76
//출력 예시
//4 3 2 1 5