package Java.dataStructure.linertable;

import java.util.LinkedList;

public class TestSingleLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList;
        java.util.ArrayList al;

        List list = new SingleLinkedList();
        list.add(0);
        list.add(111);
        list.add(222);

        list.remove(1);
//        list.add(0,333);


        System.out.println(list.toString());


//        System.out.println(list.toString());


//        System.out.println(list.addBefore(222, 333));
//        System.out.println(list.addAfter(222, 333));
//
//        list.remove(2);
//        list.remove((Object)444);
//
//        list.replace(0,999);
//
//        System.out.println(list);
//        System.out.println(list.size());


    }
}
