package mystack;

public class ArrayStack {

    protected Object[] a;
    protected int top;
    protected int max;

    public ArrayStack(int max) {
        this.max = max;
        a = new Object[max];
        top = -1;
    }

    public ArrayStack() {
        this(50);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == max - 1);
    }

    public void push(Object x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        a[++top] = x;
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        Object x = a[top];
        top--;
        return x;
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return a[top];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty!");
            return;
        }
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
