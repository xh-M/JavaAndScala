package Java.dataStructure.linertable;

public class LinkedNode {

    LinkedNode prev;
    Object data;
    LinkedNode next;

    public LinkedNode() {
    }

    public LinkedNode(LinkedNode prev, Object data, LinkedNode next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
