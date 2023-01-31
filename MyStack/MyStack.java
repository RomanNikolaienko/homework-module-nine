package MyStack;

import java.util.Objects;

public class MyStack<E> {
    private Object[] stackArray = new Object[1];
    private int size;
    private int top;

    public Object get(int index) {
        return stackArray[index];
    }

    public int size(){
        return size;
    }

    public Object peek(){
        return stackArray[top-1];
    }

    public void push(E element) {
        if (size == stackArray.length){
            Object[] newArray = new Object[stackArray.length+1];
            for (int i = 0; i < stackArray.length; i++) {
                newArray[i] = stackArray[i];
            }
            stackArray = newArray;
        }
        stackArray[top] = element;
        top++;
        size++;
    }

    public Object pop() {
        Object objToRemove = stackArray[top-1];
        Object[] newArray = new Object[stackArray.length-1];
        for (int i = 0; i < stackArray.length-1; i++) {
            newArray[i] = stackArray[i];
        }
        stackArray = newArray;
        top--;
        size--;
        return objToRemove;
    }

    public void remove(int index){
        Objects.checkIndex(index, size);
        int s = stackArray.length;
        Object[] newArray = new Object[stackArray.length-1];
        for (int i = 0; i < stackArray.length-1; i++) {
            if (index <= i){
                newArray[i] = stackArray[i+1];
            } else {
                newArray[i] = stackArray[i];
            }
        }
        stackArray = newArray;
        size--;
        top--;
    }

    public Object[] clear(){
        Object[] newArray = new Object[0];
        size = top = 0;
        return stackArray = newArray;
    }
}
