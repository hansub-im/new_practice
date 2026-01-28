package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjoon_0129 {
    public static void main(String[] args) throws IOException{
        No10807();
    }
    static void No10951() {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);

        }
        sc.close();
    }

    static void No10807() {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt();

        for(int j = 0; j < arr.length; j++) {
            if(b == arr[j]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
