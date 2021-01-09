package Java.dataStructure.linertable;

import java.util.Deque;
import java.util.Queue;

public class TestLinkedList {
    public static void main(String[] args) {

        Deque deque;
        Queue queue;

        MyLinkedList list = new MyLinkedList();

        list.add(111);
        list.add(222);
        list.add(333);

        System.out.println(list.size());


    }
}
