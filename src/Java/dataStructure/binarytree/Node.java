package Java.dataStructure.binarytree;

/**
 * @Auther: https://segmentfault.com/u/hanli_991122
 * @Date: 2020/8/31
 * @Description: Java.dataStructure.tree
 * @version: 1.0
 */
public class Node {

    Object value;
    Node leftChild;
    Node rightChild;

    public Node(Object value) {
        this.value = value;
    }

    public Node(Object value, Node leftChild, Node rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", leftChild=" + leftChild +
                ", rightChile=" + rightChild +
                '}';
    }
}
