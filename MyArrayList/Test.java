package MyArrayList;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList();

        System.out.println("myArrayList.get(2) = " + myArrayList.get(2));

        for (int i = 0, j = 1; i < 15; i++, j++) {
            myArrayList.add("Leopard 2 " + j);
        }

        System.out.println("------------------------------");

        myArrayList.remove(0);

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }

        System.out.println("------------------------------");

        myArrayList.clear();

        myArrayList.add("hello");

        System.out.println("myArrayList.get(0) = " + myArrayList.get(0));
        System.out.println("myArrayList.get(1) = " + myArrayList.get(9));
    }

}
