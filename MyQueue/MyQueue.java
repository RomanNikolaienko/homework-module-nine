package MyQueue;

public class MyQueue<E> {
    private Object[] queueArray = new Object[5];
    private int size;
    private int front = 0;
    private int rear;

    public int size(){
        return size;
    }

    public void add(E element) {
        if (size == queueArray.length){
        Object[] newArray = new Object[queueArray.length * 2];
            for (int i = 0; i < queueArray.length; i++) {
                newArray[i] = queueArray[i];
            }
            queueArray = newArray;
        }
            queueArray[rear] = element;
            rear++;
            size++;
        }

        public Object[] clear(){
        Object[] newArray = new Object[5];
        size = front = rear = 0;
        return queueArray = newArray;
        }

        public Object peek(){
        return queueArray[0];
        }

        public Object poll() {
        Object[] temp = new Object[queueArray.length];
            for (int i = 0; i < size; i++) {
                temp[i] = queueArray[i+1];
            }
            queueArray = temp;
            rear--;
            size--;
            return queueArray[0];
        }
}
