import java.util.Scanner;

public class stack {
    void push(int[] stack, int x) {
        stack[stack.length] = x;
    }

    void pop(int[] stack) {
        if (stack.length == 0) {
            System.out.println("-1");
        } else {
            int top = stack[stack.length - 1];
            stack[stack.length - 1] = 0;
            System.out.println(top);
        }
    }

    void size(int[] stack) {
        System.out.println(stack.length);
    }

    void empty(int[] stack) {
        if (stack.length == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    void top(int[] stack) {
        if (stack.length == 0) {
            System.out.println("-1");
        }
        System.out.println(stack.length-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}
