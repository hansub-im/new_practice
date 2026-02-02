package baekjoon.Jan;

import java.util.Scanner;

public class baekjoon_0121 {
    public static void main(String[] args) {
        star2();
    }

    static void star2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }


}
