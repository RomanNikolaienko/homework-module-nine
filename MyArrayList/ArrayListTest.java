package MyArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList();

        for (int i = 0, j = 1; i < 15; i++, j++) {
            myArrayList.add("Leopard 2 " + j);
        }

        myArrayList.remove(0);

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }

        System.out.println("myArrayList.size() = " + myArrayList.size());
        System.out.println("myArrayList.get(13) = " + myArrayList.get(13));

        System.out.println("------------------------------");

        myArrayList.clear();

        myArrayList.add("M1 Abrams");

        System.out.println("myArrayList.get(0) = " + myArrayList.get(0));
        System.out.println("myArrayList.get(9) = " + myArrayList.get(0));

        System.out.println("myArrayList.size() = " + myArrayList.size());
    }

}
