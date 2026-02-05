package programmers.basic;

public class Day_0205 {
    public static void main(String[] args) {

        System.out.println(q1("abcabc"));
    }

    static String q1(String code) {
        String answer = "";
        int mode = 0;

        for(int i = 0; i < code.length(); i++) {
            if(mode==0) {
                if(code.charAt(i)!='1') {
                    if(i % 2 ==0){
                        answer += code.charAt(i);
                    }
                } else if(code.charAt(i)=='1') {
                    mode = 1;
                }
            } else {
                if(code.charAt(i)!='1') {
                    if(i%2==1) {
                        answer += code.charAt(i);
                    }
                } else if(code.charAt(i)=='1') {
                    mode = 0;
                }
            }
        }
        if(answer.equals("")) {
            answer = "EMPTY";
        }
        return answer;
    }

    static int q2(int a, int d, boolean[] included) {
        int answer = 0;

        for(int i = 0; i < included.length; i++) {
            if(included[i]) {
                answer+= a  + (i * d);
                continue;
            }
        }
        return answer;
    }

    static int q3(int a, int b, int c) {
        int answer = 0;

        if(a != b && b != c && c != a) {
            answer = a + b + c;
        } else if(a != b && b == c || b != c && a == c) {
            answer = (a + b + c) * (a * a + b * b + c * c);
        } else if(b == c && a == c) {
            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b +  c * c * c);
        }
        return answer;
    }

    static int q4(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 0;

        for(int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            mul *= num_list[i];
        }
        if(sum * sum > mul) {
            answer = 1;
        }
        return answer;
    }

    static int q5(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                even += num_list[i];
            } else if(num_list[i] % 2 == 1) {
                odd += num_list[i];
            }
        }
        answer = Integer.parseInt(odd) + Integer.parseInt(even);
        return answer;
    }
}
