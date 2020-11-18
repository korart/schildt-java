package ch6;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.pop();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        stack.push(11);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("Clear stack:");
        while (stack.size() > 0)
            System.out.println(stack.pop());
    }
}
