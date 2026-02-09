package programmers.basic;

import java.util.ArrayList;
import java.util.List;

public class Day_0209 {
    public static void main(String[] args) {

    }

    static int[] solution1(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            for (int i = s; i <= e; i++) {
                if (i % k == 0) {
                    arr[i] += 1;
                }
            }
        }
        return arr;
    }

    static int[] solution2(int l, int r) {
        List<Integer> result = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String str = String.valueOf(i); // 숫자를 문자열로 변환
            boolean isMagicNum = true;

            for (char ch : str.toCharArray()) {
                if (ch != '0' && ch != '5') {
                    isMagicNum = false;
                    break;
                }
            }

            if (isMagicNum) {
                result.add(i);
            }
        }

        // 결과가 비어있으면 -1 담기
        if (result.isEmpty()) {
            return new int[]{-1};
        }

        // List를 int[]로 변환
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    static int[] solution3(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        int j = 0;
        for (int i = start_num; i <= end_num; i++) {
            answer[j] = i;
            j++;
        }
        return answer;

    }

}
