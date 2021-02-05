import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution_17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack stack = new Stack();
        String originalWord = bf.readLine();
        boolean isTag = false;

        for (char ch : originalWord.toCharArray()) {
            if (ch == '<') {
                if (!stack.isEmpty()) {
                    while (stack.size() > 0) {
                        Object pop = stack.pop();
                        sb.append(pop);
                    }
                }
                isTag = true;
                sb.append("<");
            } else if (ch == '>') {
                sb.append(">");
                isTag = false;
            } else if (ch == ' ') {
                if (isTag) {
                    sb.append(" ");
                } else {
                    if (!stack.isEmpty()) {
                        while (stack.size() > 0) {
                            Object pop = stack.pop();
                            sb.append(pop);
                        }
                    }
                    sb.append(" ");
                }
            } else {
                if (isTag) {
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
