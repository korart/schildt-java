package ch9.Stack;

public class DynStack implements IntStack {
    private int[] stack;
    private int tos;

    public DynStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if(tos == stack.length - 1) {
            int[] temp = new int[stack.length * 2];
            for (int i = 0; i < stack.length; i++) {
                temp[i] = stack[i];
            }
            stack = temp;
            stack[++tos] = item;
        }
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

class DSTest {

    public static void main(String[] args) {
        DynStack stack1 = new DynStack(5);
        DynStack stack2 = new DynStack(8);
        IntStack stack3 = new DynStack(5);

        stack3.push(1);
        System.out.println(stack3.pop());
        System.out.println(stack3.pop());

        for (int i = 0; i < 12; i++) {
            stack1.push(i + 1);
        }
        for (int i = 0; i < 15; i++) {
            stack2.push(i + 2);
        }

        System.out.println("DynStack1 data: ");
        for (int i = 0; i < 12; i++) {
            System.out.println(stack1.pop());
        }
        System.out.println("DynStack2 data: ");
        for (int i = 0; i < 15; i++) {
            System.out.println(stack2.pop());
        }
    }
}
