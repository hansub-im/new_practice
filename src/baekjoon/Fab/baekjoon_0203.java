package baekjoon.Fab;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjoon_0203 {
    public static void main(String[] args) throws Exception {
        No2562_2();
    }

    static void No2562() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];

        for(int i=0; i<9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = arr[0];
        int maxIndex = 0;
        for(int i=1; i<9; i++) {
            if(arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex + 1);
        br.close();
    }

    static void No2562_2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int maxIndex = 0;

        for(int i=0; i<=9; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > max) {
                max = num;
                maxIndex = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex);
        br.close();
    }


}


