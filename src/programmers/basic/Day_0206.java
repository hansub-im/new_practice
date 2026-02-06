package programmers.basic;

public class Day_0206 {
    public static void main(String[] args) {
        System.out.println(q2(0, "wadswsda"));
    }

    static int[] q1(int[] num_list) {
        int n = num_list.length;
        int[] answer = new int[n + 1];

        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }

        int last = num_list[n - 1];
        int prev = num_list[n - 2];

        if (last > prev) {
            answer[n] = last - prev;
        } else {
            answer[n] = last * 2;
        }

        return answer;
    }

    static int q2(int n, String control) {
        int answer = 0;

        for(int i = 0; i < control.length(); i++) {
            if(control.charAt(i) == 'w') {
                n += 1;
            } else if(control.charAt(i) == 's') {
                n -= 1;
            } else if(control.charAt(i) == 'd') {
                n += 10;
            } else {
                n -= 10;
            }

        }
        answer = n;
        return answer;
    }

    static String q3(int[] numlog) {
        StringBuilder answer = new StringBuilder();

        // numLog[1]부터 마지막 원소까지 순회하며 이전 원소와 비교
        for (int i = 1; i < numlog.length; i++) {
            int diff = numlog[i] - numlog[i - 1];

            // Java 12 이상이라면 switch expression(yield)을 쓸 수 있지만,
            // 프로그래머스 환경을 고려해 표준 switch 문을 사용합니다.
            switch (diff) {
                case 1:
                    answer.append("w");
                    break;
                case -1:
                    answer.append("s");
                    break;
                case 10:
                    answer.append("d");
                    break;
                case -10:
                    answer.append("a");
                    break;
            }
        }

        return answer.toString();
    }

    static int[] q4(int[] arr, int[][] queries) {
        // 1. queries 배열을 한 행씩 순회합니다.
        for (int k = 0; k < queries.length; k++)
        {
            // 2. 바꿀 위치인 i와 j를 꺼냅니다.
            int i = queries[k][0];
            int j = queries[k][1];

            // 3. Swap(맞바꾸기) 로직
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // 4. 모든 쿼리 처리가 끝난 배열을 반환합니다.
        return arr;
    }

    static int[] q5(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            // k보다 큰 값 중 최소값을 찾아야 하므로, 아주 큰 값으로 초기화
            int min = Integer.MAX_VALUE;
            boolean found = false;

            // s부터 e까지 범위를 뒤집니다.
            for (int j = s; j <= e; j++) {
                if (arr[j] > k && arr[j] < min) {
                    min = arr[j];
                    found = true;
                }
            }

            // 값을 찾았으면 min, 못 찾았으면 -1 저장
            answer[i] = found ? min : -1;
        }

        return answer;
    }
}
