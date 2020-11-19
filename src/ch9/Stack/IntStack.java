package ch9.Stack;

public interface IntStack {
    void push(int item);
    int pop();
    default void clear() {
        throw new UnsupportedOperationException("method clear() not supported");
    }
}
