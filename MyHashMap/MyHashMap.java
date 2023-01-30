package MyHashMap;

public class MyHashMap<K, V> {
    public class Node<K, V> {
        private K key;
        private V value;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node<K, V> head;
    private int size;
    private Node<K, V> array[] = new Node[5];


    public int size() {
        return size;
    }

    public void put(K key, V value) {
        int hash = key.hashCode() % array.length;
        Node<K, V> newNode = array[hash];
        if (newNode == null) {
            array[hash] = new Node<K, V>(key, value);
        } else {
            while (newNode != null) {
                if (newNode.key == key) {
                    newNode.value = value;
                    return;
                }
                newNode = newNode.next;
            }
            if (newNode.key == key) {
                newNode.value = value;
                return;
            }
            newNode.next = new Node<K, V>(key, value);
        }
        size++;
    }

    public V get(K key) {
        int hash = key.hashCode() % array.length;
        Node<K, V> newNode = array[hash];

        if (newNode == null) {
            return null;
        }

        while (newNode != null) {
            if (newNode.key == key) {
                return newNode.value;
            }
            newNode = newNode.next;
        }
        return null;
    }

    public Node<K, V> remove(K key) {
        int hash = key.hashCode() % array.length;
        Node<K, V> newNode = array[hash];
        if (newNode == null){
            return null;
        }
        if (newNode.key == key){
            array[hash] = newNode.next;
            newNode.next = null;
            size--;
            return newNode;
        }
        Node<K,V> prev = newNode;
        newNode = newNode.next;

        while (newNode != null){
            if (newNode.key == key){
                prev.next = newNode.next;
                newNode.next = null;
                return newNode;
            }
        }
        size--;
        return null;
    }

    public void clear() {
        Node<K,V>[] newArray;
        if ((newArray = array) != null && size > 0) {
            size = 0;
            for (int i = 0; i < newArray.length; ++i)
                newArray[i] = null;
        }
    }
}
