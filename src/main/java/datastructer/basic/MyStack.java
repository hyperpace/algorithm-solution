package datastructer.basic;

public class MyStack {
    private int top;
    private int size;
    private int[] stack;

    public MyStack() {
        this.top = -1;
        this.stack = new int[100];
    }

    public void push(int value) {
        stack[++top] = value;
    }

    public int peek() {
        return stack[top];
    }

    public int pop() throws IllegalAccessException {
        if (empty()) {
            throw new IllegalAccessException();
        }

        return stack[top--];
    }

    public boolean empty() {
        return top == -1;
    }
}
