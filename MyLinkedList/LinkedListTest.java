package MyLinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        myLinkedList.add("Leopard");
        myLinkedList.add("Leopard 2");
        myLinkedList.add("Challenger 2");
        myLinkedList.add("M1 Abrams");

        myLinkedList.remove(2);

        System.out.println("myLinkedList.get(0) = " + myLinkedList.get(0));
        System.out.println("myLinkedList.get(0) = " + myLinkedList.get(1));
        System.out.println("myLinkedList.get(0) = " + myLinkedList.get(2));
        System.out.println("myLinkedList.size() = " + myLinkedList.size());

        myLinkedList.remove(0);
        System.out.println("myLinkedList.get(3) = " + myLinkedList.get(0));
        System.out.println("myLinkedList.get(3) = " + myLinkedList.get(1));
        System.out.println("myLinkedList.size() = " + myLinkedList.size());

        System.out.println("myLinkedList.get(2) = " + myLinkedList.get(0));

        myLinkedList.clear();

        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);

        System.out.println("myLinkedList.get(0) = " + myLinkedList.get(0));
        System.out.println("myLinkedList.get(1) = " + myLinkedList.get(1));
        System.out.println("myLinkedList.get(2) = " + myLinkedList.get(2));
        System.out.println("myLinkedList.get(3) = " + myLinkedList.get(3));
        System.out.println("myLinkedList.size() = " + myLinkedList.size());



    }
}
