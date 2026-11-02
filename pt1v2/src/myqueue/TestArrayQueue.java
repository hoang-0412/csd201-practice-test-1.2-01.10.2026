package myqueue;

public class TestArrayQueue {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.display();
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        queue.display();
        queue.enqueue("D");
        queue.display();
    }
}
