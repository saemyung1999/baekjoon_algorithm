import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack stack = new Stack();
        int num = 0;
        int numOfLine = 0;
        String ps = bf.readLine();

        for (char ch : ps.toCharArray()) {
            num++;
            if (ch == '(') {
                stack.push(num);
            } else {
                if (Integer.parseInt(stack.peek().toString()) + 1 == num) {
                    stack.pop();
                    numOfLine += stack.size();
                } else {
                    stack.pop();
                    numOfLine += 1;
                }
            }
        }
        System.out.println(numOfLine);
    }
}
