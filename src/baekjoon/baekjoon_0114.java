package baekjoon;

import java.util.Scanner;

public class baekjoon_0114 {
    public static void main(String[] args) {
        longAndByte();
    }
    static void longAndByte() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = n / 4;

        for (int i = 0; i < count; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }

}
