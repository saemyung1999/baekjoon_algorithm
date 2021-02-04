import java.io.*;
import java.util.Stack;

public class Solution_9012 {

    String psCheckFunc(String ps) {
        Stack<Character> stack = new Stack();
        for (char ch : ps.toCharArray()) {
            if (ch == '(') {
                stack.push('(');
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            return "NO";
        } else {
            return "YES";
        }
    }

    public static void main(String[] args) throws IOException {
        Solution_9012 solution_9012 = new Solution_9012();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testNum = Integer.parseInt(bf.readLine());

        while (testNum-- > 0) {
            String ps = bf.readLine();
            bw.write(solution_9012.psCheckFunc(ps));
            bw.flush();
        }
    }
}
