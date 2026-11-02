package myqueue;

public class ArrayQueue {

    protected Object[] a;
    protected int max;
    protected int first, last;

    public ArrayQueue(int max) {
        this.max = max;
        a = new Object[max];
        first = last = -1;
    }

    public ArrayQueue() {
        this(50);
    }

    public boolean isEmpty() {
        return (first == -1);
    }

    public boolean isFull() {
        return ((first == 0 && last == max - 1) || (first == last + 1));
    }

    public void enqueue(Object x) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        if (last == -1) {
            first = last = 0;
        } else if (last == max - 1) {
            last = 0;
        } else {
            last++;
        }
        a[last] = x;
    }

    public Object dequeue() {
        if (isEmpty()) {
            return null;
        }
        Object x = a[first];
        if (first == last) {
            first = last = -1;
        } else if (first == max - 1) {
            first = 0;
        } else {
            first++;
        }
        return x;
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return a[first];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        System.out.print("Queue: ");
        int i = first;
        while (true) {
            System.out.print(a[i] + " ");
            if (i == last) {
                break;
            }
            i = (i + 1) % max;
        }
        System.out.println();
    }
}
