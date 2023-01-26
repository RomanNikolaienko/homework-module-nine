package MyArrayList;

public class MyArrayList<E> {
    private Object[] elementData = new Object[10];
    private int index = 0;

    public void add(E e){
        elementData[index] = e;
        index++;
        if (index == elementData.length){
            Object[] newElementData = new Object[elementData.length * 2];
            for (int i = 0; i < elementData.length; i++) {
                newElementData[i] = elementData[i];
            }
            elementData = newElementData;
            }
    }

    public void remove(int index){
        for (int i = index; i < elementData.length - 1; i++) {
            elementData[i] = elementData[i+1];
        }
        this.index--;
    }

    public void clear(){
        this.elementData = new Object[10];
        this.index = 0;
    }

    public E get(int index){
        return (E) elementData[index];
    }

    public int size(){
        return index;
    }

}
