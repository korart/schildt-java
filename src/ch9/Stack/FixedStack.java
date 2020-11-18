package ch9.Stack;

public class FixedStack implements IntStack {
    private int[] stack;
    private int tos;

    public FixedStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if(tos == stack.length - 1)
            System.out.println("Stack is full");
        else
            stack[++tos] = item;
    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}

class FSTest {
    public static void main(String[] args) {
        FixedStack stack1 = new FixedStack(10);
        FixedStack stack2 = new FixedStack(15);
        
        for (int i = 0; i < 10; i++) {
            stack1.push(i * 3);
        }
        for (int i = 0; i < 15; i++) {
            stack2.push(i * 2);
        }

        System.out.println("Stack1 data: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(stack1.pop());
        }
        System.out.println("Stack2 data: ");
        for (int i = 0; i < 15; i++) {
            System.out.println(stack2.pop());
        }
    }
}
