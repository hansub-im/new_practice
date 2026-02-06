package baekjoon.Fab;

import java.util.Scanner;

public class baekjoon_0205 {
    public static void main(String[] args) throws Exception {
        No10810();
    }

    static void No10810() {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] basket = new int[N + 1];

        for(int t = 0; t < M; t++) {  // M번 반복!
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for(int b = i; b <= j; b++) {
                basket[b] = k;
            }
        }

        for(int x = 1; x <= N; x++){
            System.out.print(basket[x] + " ");  // println → print
        }
    }



}


