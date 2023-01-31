package MyLinkedList;

import java.util.Objects;

public class MyLinkedList<E> {
    public class Node<E> {
        E element;
        Node<E> prev;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public int size() {
        return size;
    }

    public void add(E element) {
        Node<E> newNode = new Node<>(element);
        if (size == 0) {
            head = newNode;
            head.prev = null;
            head.next = tail;
        } else {
            tail.next = newNode;
        }
        newNode.prev = tail;
        tail = newNode;
        tail.next = null;
        size++;
    }

    public E get(int index) {
        Objects.checkIndex(index, size);
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = getNextNode(current);
        }
        return current.element;
    }

    private Node<E> getNextNode(Node<E> current) {
        return current.next;
    }

    private Node<E> getNodeByIndex(int index){
        Objects.checkIndex(index, size);
        Node<E> tempNode = head;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.next;
        }
        return tempNode;
    }

    public void remove(int index) {
        Objects.checkIndex(index, size);
        if (index == 0) {
            head = head.next;
            head.prev = null;
            if (head == null){
                tail = null;
            }
        } else if (index == size) {
            tail = tail.prev;
            tail.next = null;
        } else {
            Node<E> temp = getNodeByIndex(index - 1);
            temp.prev = temp.prev.prev;
            temp.next = temp.next.next;
        }
        size--;

    }

    public void clear(){
        size = 0;
        head = tail = null;
    }
}