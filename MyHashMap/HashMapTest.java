package MyHashMap;

public class HashMapTest {
    public static void main(String[] args) {
        MyHashMap<Integer, String> myHashMap = new MyHashMap<Integer, String>();
        myHashMap.put(1,"Leopard");
        myHashMap.put(1,"Leopard 2");
        myHashMap.put(1,"M1 Abrams");
        myHashMap.put(1,"Challenger 2");
        myHashMap.put(2,"BM Oplot");


        System.out.println("myHashMap.get(2) = " + myHashMap.get(2));
        System.out.println("myHashMap.size() = " + myHashMap.size());

        myHashMap.clear();
        System.out.println("myHashMap.size() = " + myHashMap.size());
        System.out.println("myHashMap.get(1) = " + myHashMap.get(1));
        System.out.println("myHashMap.get(1) = " + myHashMap.get(2));


    }
}
