package Java.dataStructure.linertable;

public class TestArrayList {
    public static void main(String[] args) {
        java.util.ArrayList al;

        ArrayList list = new ArrayList();
        list.add(111);
        list.add(222);
        list.add(555);

        list.add(2,444);

//        System.out.println(list.addBefore(222, 333));
        System.out.println(list.addAfter(222, 333));

        list.remove(2);
        list.remove((Object)444);

        list.replace(0,999);

        System.out.println(list);
        System.out.println(list.size());


    }
}
