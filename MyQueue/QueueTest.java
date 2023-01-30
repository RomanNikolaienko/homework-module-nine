package MyQueue;

public class QueueTest {
    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<String>();
        myQueue.add("One");
        myQueue.add("Two");
        myQueue.add("Three");
        myQueue.add("Four");
        myQueue.add("Five");
        myQueue.add("Six");
        myQueue.add("Seven");
        System.out.println("myQueue.peek() = " + myQueue.peek());
        System.out.println("myQueue.size() = " + myQueue.size());
        System.out.println("myQueue.poll() = " + myQueue.poll());
        System.out.println("myQueue.poll() = " + myQueue.poll());
        System.out.println("myQueue.poll() = " + myQueue.poll());
        System.out.println("myQueue.poll() = " + myQueue.poll());
        System.out.println("myQueue.poll() = " + myQueue.poll());
        System.out.println("myQueue.poll() = " + myQueue.poll());
        System.out.println("myQueue.peek() = " + myQueue.peek());

        myQueue.add("Six");
        myQueue.add("Seven");

        System.out.println("myQueue.peek() = " + myQueue.peek());
        System.out.println("myQueue.size() = " + myQueue.size());
    }
}
