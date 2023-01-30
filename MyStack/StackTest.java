package MyStack;

public class StackTest {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<String>();
        int j = 1;
        for (int i = 0; i < 11; i++) {
            myStack.push("Leopard " + j);
            j++;
        }

        System.out.println("myStack.size() = " + myStack.size());

        System.out.println("myStack.peek() = " + myStack.peek());
        System.out.println("myStack.pop() = " + myStack.pop());

        System.out.println("myStack.size() = " + myStack.size());
        System.out.println("myStack.peek() = " + myStack.peek());
        myStack.remove(5);
        System.out.println("myStack.size() = " + myStack.size());
        System.out.println("myStack.peek() = " + myStack.peek());
        System.out.println("myStack.get(0) = " + myStack.get(8));
        System.out.println("myStack.clear() = " + myStack.clear());
    }

}
