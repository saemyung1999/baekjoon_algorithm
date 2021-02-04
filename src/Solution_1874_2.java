import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution_1874_2 {
    public static void main(String[] args) throws IOException {
        Stack stack = new Stack();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testNum = Integer.parseInt(bf.readLine());
        int num = 0;

        while (testNum-- > 0) {
            int seq = Integer.parseInt(bf.readLine());
            if (seq > num) {
                while (seq > num) {
                    stack.push(++num);
                    sb.append("+ \n");
                }
                stack.pop();
                sb.append("- \n");
            } else {
                Object peek = stack.peek();
                if (peek.equals(seq)) {
                    stack.pop();
                    sb.append("- \n");
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println(sb);
    }
}
