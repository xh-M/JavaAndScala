package Java.dataStructure.linertable;

import com.sun.xml.internal.bind.marshaller.NoEscapeHandler;

/**
 * 单链表的结点
 */
public class Node {
    /**
     * 为了便于理解 不使用private修饰
     */
    Object data;//要存储的数据
    Node next;//

    public Node() {
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
