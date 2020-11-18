package ch6;

public class Stack {
    private int[] stck = new int[10];
    private int tos;

    public Stack() {
        tos = -1;
    }

    public void push(int item) {
        if (tos == 9)
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty.");
            return 0;
        }
        else
            return stck[tos--];
    }

    public int size() {
        return tos + 1;
    }
}
