package programmers.basic;

public class Day_0204 {
    public static void main(String[] args) {
        System.out.println(q7(10));
    }
    static String q1(String str1, String str2) {
        String answer = "";

        for (int i = 0; i < str1.length(); i++) {

            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        return answer;
    }

    static String q2(String[] arr) {
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }

    static String q3(String my_string, int k) {
        String answer = "";
        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        return answer;
    }

    static int q4(int a, int b) {
        int answer = 0;
        int ab = Integer.parseInt(a + "" + b);
        int ba = Integer.parseInt(b + "" + a);
        answer = ab >= ba ? ab : ba;
        return answer;

    }

    static int q5(int num, int n) {
        int answer = 0;
        if(num % n == 0) {
            answer = 1;
        }
        return answer;
    }

    static int q6(int num, int n, int m){
        int answer = 0;
        if(num % m == 0 && num % m == 0) {
            answer = 1;
        }
        return answer;
    }

    static int q7(int n) {
        int answer = 0;
        if(n % 2 != 0) {
            for(int i=0; i<=n; i ++) {
                if(i % 2 != 0) {
                    answer += i;
                }
            }
        } else if(n % 2 == 0){
            for(int i=0; i<=n; i++) {
                if(i % 2 == 0) {
                    answer += i*i;
                }
            }

        }
        return answer;
    }

    static int q8(String ineq, String eq, int n, int m) {
        int answer = 0;
        String op = ineq + eq;
        if(op.equals(">=")) {
            return n >= m ? 1 : 0;
        } else if(op.equals("<=")) {
            return n <= m ? 1 : 0;
        } else if(op.equals(">!")) {
            return n == m ? 1 : 0;
        } else if(op.equals("<!")) {
            return n == m ? 1 : 0;
        }
        return answer;
    }
}
