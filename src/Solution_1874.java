import java.io.*;
import java.util.Stack;

public class Solution_1874 {
    public static void main(String[] args) throws IOException {
        Stack stack = new Stack();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testNum = Integer.parseInt(bf.readLine());
        int top = 0;

        while (testNum-- > 0) {
            int seq = Integer.parseInt(bf.readLine());

            while (seq > top) {
                stack.push(++top);
                sb.append("+ \n");
            }

            if (seq <= top) {
                Object pop = stack.pop();
                if (pop.equals(seq)) {
                    sb.append("- \n");
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        }
        stack.clear();
        System.out.println(sb);
    }
}
