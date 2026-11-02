package mystack;

public class TestArrayStack {

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.display();
        System.out.println(stack.isEmpty());
    }
}
