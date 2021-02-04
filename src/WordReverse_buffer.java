import java.io.*;
import java.util.Stack;

public class WordReverse_buffer {
    public static void main(String[] args) throws IOException {
        Stack<Character> stack = new Stack();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testNum = Integer.parseInt(bf.readLine());

        while (testNum-- > 0) {
            String originalWord = bf.readLine();
            originalWord += "\n";
            for (char ch : originalWord.toCharArray()) {
                if (ch == ' ' || ch == '\n') {
                    while (!stack.empty()) {
                        bw.write(stack.pop());
                    }
                    bw.write(ch);
                } else {
                    stack.push(ch);
                }
            }
            bw.flush();
        }
    }
}
