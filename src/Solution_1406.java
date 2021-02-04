import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack leftStack = new Stack();
        Stack rightStack = new Stack();

        String readLine = bf.readLine();
        for (char ch : readLine.toCharArray()) {
            leftStack.push(ch);
        }

        int testNum = Integer.parseInt(bf.readLine());

        while (testNum-- > 0) {
            String command = bf.readLine();

            if (command.equals("L")) {
                if (!leftStack.isEmpty()) {
                    Object pop = leftStack.pop();
                    rightStack.push(pop);
                }
            } else if (command.equals("D")) {
                if (!rightStack.isEmpty()) {
                    Object pop = rightStack.pop();
                    leftStack.push(pop);
                }
            } else if (command.equals("B")) {
                if (!leftStack.isEmpty()) {
                    leftStack.pop();
                }
            } else {
                leftStack.push(command.substring(2));
            }
        }
        while (!leftStack.isEmpty()) {
            Object pop = leftStack.pop();
            rightStack.push(pop);
        }
        while (!rightStack.isEmpty()) {
            Object pop = rightStack.pop();
            sb.append(pop);
        }
        System.out.println(sb);
    }
}
