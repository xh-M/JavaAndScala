package Java.dataStructure.mianshiti;

/**
 * @Auther: https://segmentfault.com/u/hanli_991122
 * @Date: 2020/10/12
 * @Description: Java.dataStructure.mianshiti
 * @version: 1.0
 */
public class cycleSingleLInkedList {
    public static void main(String[] args) {
        Node lastNode = new Node(10);
        Node node9 = new Node(9,lastNode);
        Node node8 = new Node(8,node9);
        Node node7 = new Node(7,node8);
        Node node6 = new Node(6,node7);
        Node node5 = new Node(5,node6);
        Node node4 = new Node(4,node5);
        Node node3 = new Node(3,node4);
        Node node2 = new Node(2,node3);
        Node headNode = new Node(1,node2);
        lastNode.next = headNode;
        josephus(headNode,lastNode,10,2,3);
    }

    /**
     *
     * @param headNode
     * @param lastNode
     * @param size
     * @param start 从第几个小孩开始报数
     * @param count 每次数几个
     */
    public static void josephus(Node headNode, Node lastNode, int size, int start, int count){
        //让headNode指向开始（start）的小孩
        for (int i = 0; i < start - 1; i++) {
            headNode = headNode.next;
            lastNode = lastNode.next;
        }
        while (size != 0 ){
            for (int i = 0; i < count - 1; i++) {
                //找到需要出圈的小号，并让headNode指向出圈的小孩
                headNode = headNode.next;
                lastNode = lastNode.next;
            }
            //输出出圈小孩
            System.out.print(headNode.data + " ");
            //删除结点
            Node nextNode = headNode.next;
            headNode = nextNode;
            lastNode.next = headNode;
            size--;
        }
    }



    private static class Node{
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
