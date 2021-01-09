package Java.dataStructure.linertable;

public class MyLinkedList implements List{
    //元素个数
    private int size;
    //记录链表的头节点引用
    LinkedNode first;
    //记录链表的尾节点引用
    LinkedNode last;

    //添加元素
    public void add(Object e) {
        //尾节点引用会改变
        LinkedNode l = last;
        //创建新节点，它的前驱节点是原先的尾节点，后续节点为null
        LinkedNode newNode = new LinkedNode(l,e,null);
        //记录尾节点引用指向新创建的节点
        last = newNode;
        //这里是判断一下，如果链表中没有元素，就让头节点引用也指向新创建的节点
        if (first == null) {
            first = newNode;
        }else{
            //改变原先尾节点的后续节点为新尾节点
            l.next = newNode;
        }
        size++;
        System.out.println();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object get(int i) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object e) {
        return false;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public void add(int i, Object e) {

    }

    @Override
    public boolean addBefore(Object obj, Object e) {
        return false;
    }

    @Override
    public boolean addAfter(Object obj, Object e) {
        return false;
    }

    @Override
    public Object remove(int i) {
        return null;
    }

    @Override
    public boolean remove(Object e) {
        return false;
    }

    @Override
    public Object replace(int i, Object e) {
        return null;
    }
}
