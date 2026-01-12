package baekjoon;

import java.util.Scanner;

public class baekjoon_0112 {
    public static void main(String[] args) {
        Receipt();
    }
    static void Receipt() {
        Scanner sc = new Scanner(System.in);
        long totalAmount = sc.nextLong();
        int n = sc.nextInt();
        long claculatedSum = 0;

        for(int i=0; i<n; i++) {
            long price = sc.nextLong();
            int count = sc.nextInt();
            claculatedSum += (price * count);
        }

        if(claculatedSum == totalAmount) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }

}
