package MyArrayList;

import java.util.Objects;

public class MyArrayList<E> {
    private Object[] array = new Object[0];
    private int size = 0;

    public void add(E e) {
        Object[] newArray = new Object[array.length + 1];
        if (size == array.length) {
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = e;
        size++;
    }

    public void remove(int index) {
        Objects.checkIndex(index, size);
        Object[] newArray = new Object[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            newArray[i] = array[i];
            if (i >= index) {
                newArray[i] = array[i + 1];
            }
        }
        array = newArray;
        size--;
    }

    public void clear() {
        array = new Object[0];
        size = 0;
    }

    public Object get(int index) {
        Objects.checkIndex(index, size);
        return array[index];
    }

    public int size() {
        return size;
    }

}
