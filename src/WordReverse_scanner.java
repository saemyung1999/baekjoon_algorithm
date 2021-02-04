import java.util.Scanner;
import java.util.Stack;

public class WordReverse_scanner { //1초 시간 제한 초과 --> Buffer 사용해야함
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int testNum = sc.nextInt();
        sc.nextLine();

        while (testNum-- > 0) {
            String originalWord = sc.nextLine();
            originalWord += "\n";
            for (char ch : originalWord.toCharArray()) {
                if (ch == ' ' || ch == '\n') {
                    while (!stack.isEmpty()) {
                        System.out.print(stack.pop());
                    }
                    System.out.print(" ");
                } else {
                    stack.push(ch);
                }
            }
        }
        sc.close();
    }
}
