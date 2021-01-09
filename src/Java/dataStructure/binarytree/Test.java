package Java.dataStructure.binarytree;

/**
 * @Auther: https://segmentfault.com/u/hanli_991122
 * @Date: 2020/8/31
 * @Description: Java.dataStructure.binarytree
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //创建一个二叉树
        Node node5 = new Node(5,null,null);
        Node node4 = new Node(4,null,node5);
        Node node7 = new Node(7,null,null);
        Node node6 = new Node(6,null,node7);
        Node node3 = new Node(3,null,null);
        Node node2 = new Node(2,node3,node6);
        Node node1 = new Node(1,node4,node2);

        BinaryTree binaryTree = new LinkedBinaryTree(node1);
//        BinaryTree binaryTree = new LinkedBinaryTree();

        //判断二叉树是否为空

//        先序遍历递归 1 4 5 2 3 7 6
//        binaryTree.preOrderTraverse();

        //中序遍历递归 4 5 1 3 2 6 7
        binaryTree.inOrderTraverse();

        //后序遍历递归
//        binaryTree.postOrderTraverse();

        //中序遍历非递归：栈

        //按照层次遍历：队列
        binaryTree.levelOrderByStack();

        //在二叉树中查找某个值
//        System.out.println(binaryTree.findKey(7));

        //二叉树高度
//        System.out.println(binaryTree.getHeight());

        //二叉树结点数量
//        System.out.println(binaryTree.size());


    }
}
