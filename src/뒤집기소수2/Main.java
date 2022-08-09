package 뒤집기소수2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public boolean isPrime(int prime) {
        if(prime == 1) return false;
        for (int i = 2; i <= Math.sqrt(prime); i++) {
            if (prime % i == 0) {
                return false;
            }
        }
        return true;
    }
    public List<Integer> solution(int cnt, int[] arr) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i : arr) {

            int tmp = i;
            int res = 0;
            while (tmp > 0) { //23
                int mod = tmp % 10; // 3 22
                res = res * 10 + mod; //32
                tmp = tmp / 10; // 2
//                System.out.println(tmp);
            }
            if (isPrime(res)){ list.add(res);}

        }

        return list;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = s.nextInt();
        }
        for (int i : t.solution(cnt, arr)) {
            System.out.print(i + " ");
        }
    }
}

//27
//        469 84 8851 189 69 1210 682 57 6217 484 8 3590 662 36 8275 887 17 1254 462 67 8969 141 70 5603 958 100 3843