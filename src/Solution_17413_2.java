import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution_17413_2 {

    private void extractStack(Stack stack, StringBuilder sb) {
        while (stack.size() > 0) {
            Object pop = stack.pop();
            sb.append(pop);
        }
    }

    public static void main(String[] args) throws IOException {
        Solution_17413_2 solution_17413_2 = new Solution_17413_2();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack stack = new Stack();
        String originalWord = bf.readLine();
        boolean isTag = false;

        for (char ch : originalWord.toCharArray()) {
            if (ch == '<') {
                solution_17413_2.extractStack(stack, sb);
                isTag = true;
                sb.append("<");
            } else if (ch == '>') {
                sb.append(">");
                isTag = false;
            } else if (isTag) {
                sb.append(ch);
            } else {
                if (ch == ' ') {
                    solution_17413_2.extractStack(stack, sb);
                    sb.append(ch);
                } else {
                    stack.push(ch);
                }
            }
        }
        while (!stack.isEmpty()) {
            Object pop = stack.pop();
            sb.append(pop);
        }

        System.out.println(sb);
    }
}
