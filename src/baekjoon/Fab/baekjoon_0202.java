package baekjoon.Fab;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjoon_0202 {
    public static void main(String[] args) throws Exception {
        No10818();
    }

        static void No10818() throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine()); // 첫 번째 줄: N

            // 2. StringTokenizer로 공백 기준 데이터 분리
            StringTokenizer st = new StringTokenizer(br.readLine());

            int min = 1000001;
            int max = -1000001;

            while (st.hasMoreTokens()) {
                int current = Integer.parseInt(st.nextToken());
                if (current < min) min = current;
                if (current > max) max = current;
            }

            // 3. 결과 출력
            System.out.println(min + " " + max);
        }

        static void No10818_2() {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int [] arr = new int[N];

            for(int i=0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[0] + " " + arr[N - 1]);
        }

}