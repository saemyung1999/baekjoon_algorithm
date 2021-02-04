import java.io.*;
import java.util.Stack;

public class Solution_9012_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testNum = Integer.parseInt(bf.readLine());

        while (testNum-- > 0) {
            Stack<Character> stack = new Stack();
            String ps = bf.readLine();
            boolean bool = true;
            for (char ch : ps.toCharArray()) {
                if (ch == '(') {
                    stack.push('(');
                } else {
                    if (stack.isEmpty()) {
                        bool = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if (bool && stack.isEmpty()) {
                sb.append("YES \n");
            } else {
                sb.append("NO \n");
            }
        }
        System.out.println(sb.toString());
    }
}
