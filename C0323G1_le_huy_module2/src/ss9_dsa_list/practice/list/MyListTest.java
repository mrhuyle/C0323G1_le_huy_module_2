package ss9_dsa_list.practice.list;

import java.util.List;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(999);
        System.out.println(listInteger.getSize());
        System.out.println("element 0: "+listInteger.get(0));
        listInteger.add(777);
        System.out.println(listInteger.getSize());
        System.out.println("element 1: "+listInteger.get(1));
        listInteger.add(3);
        System.out.println(listInteger.getSize());
        listInteger.add(3);
        System.out.println(listInteger.getSize());
        listInteger.add(4);
        System.out.println(listInteger.getSize());

        System.out.println("element 2: "+listInteger.get(2));
        System.out.println("element 2: "+listInteger.get(3));
        System.out.println("element 4: "+listInteger.get(4));

//        listInteger.get(-1);
//        System.out.println("element -1: " + listInteger.get(-1));

        listInteger.get(5);
        System.out.println("element 6: "+listInteger.get(5));
    }
}
