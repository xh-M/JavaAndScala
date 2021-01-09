package Java.dataStructure.linertable;

public class SingleLinkedList implements List {

    private Node head = new Node();//头节点，不存储数据，为了编程方便

    private int size;//一共有几个结点

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        //和顺序表不一样了，不能通过索引直接定位，需要从头节点开始进行查找
        Node p = head;
        for (int j = 0; j <= i; j++) {
            p = p.next;
        }
        return p;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
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
        //如果i的位置错误报异常
        if (i < 0 || i > size){
            throw new MyArrayIndexOutOfBoundsException("指针越界异常："+"i");
        }
        //找到前一个节点，从头节点head开始移动指针
        Node p = head;
        for (int j = 0; j < i; j++) {
            p = p.next;
        }
        //新创建一个节点
        Node newNode = new Node(e,null);
        //需要先指明新节点的直接后继节点，
        newNode.next = p.next;
        //再指明新节点的直接前驱节点
        p.next = newNode;
        //节点个数+1
        size++;
    }

    @Override
    public void add(Object e) {
        this.add(size,e);
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
        if (i < 0 || i > size){
            throw new MyArrayIndexOutOfBoundsException("指针越界异常："+"i");
        }
        Node p = head;
        for (int j = 0; j < i; j++) {
            p = p.next;
        }
        Node temp = p.next;
        p.next = temp.next;
        temp.next = null;
        size--;
        return temp.data;
    }

    @Override
    public boolean remove(Object e) {
        return false;
    }

    @Override
    public Object replace(int i, Object e) {
        return null;
    }

    @Override
    public String toString() {
        if (size == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Node p = head.next;

        for (int i = 0; i < size; i++) {
            if (i != size - 1){
                builder.append(p.data + ",");
            }else {
                builder.append(p.data);
            }
            p = p.next;
        }
        builder.append("]");
        return builder.toString();
    }
}
