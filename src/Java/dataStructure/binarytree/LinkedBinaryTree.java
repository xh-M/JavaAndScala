package Java.dataStructure.binarytree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Auther: https://segmentfault.com/u/hanli_991122
 * @Date: 2020/8/31
 * @Description: Java.dataStructure.binarytree
 * @version: 1.0
 */
public class LinkedBinaryTree implements BinaryTree {

    private Node root;

    public LinkedBinaryTree() {
    }

    public LinkedBinaryTree(Node root) {
        this.root = root;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public int size() {
        System.out.println("二叉树的结点数量：");
        return this.size(root);
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        }
        else {
            int lsize = this.size(node.leftChild);
            int rsize = this.size(node.rightChild);
            return lsize + rsize + 1;
        }
    }

    @Override
    public int getHeight() {
        return this.getHeight(root);
    }

    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        else {
            //获取左子树高度
            int lh = this.getHeight(node.leftChild);
            //获取右子树高度
            int rh = this.getHeight(node.rightChild);
            //返回
            return lh > rh ? lh + 1 : rh + 1;
        }
    }

    @Override
    public Node findKey(int value) {
        return null;
//        return this.findKey(value, root);
    }

//    private Node findKey(Object value, Node root) {
//        if (root == null) {
//            return null;
//        }
//        if (root != null && root.value == value) {
//            return root;
//        }
////        this.findKey(value, root.leftChild);
////        this.findKey(value, root.rightChild);
//    }

    @Override
    public void preOrderTraverse() {
        if (root != null) {
            //输出根结点的值
            System.out.println(root.value);
            //对左子树进行先序遍历
            LinkedBinaryTree leftTree = new LinkedBinaryTree(root.leftChild);
            leftTree.preOrderTraverse();
            //对右子树进行先序遍历
            LinkedBinaryTree rightTree = new LinkedBinaryTree(root.rightChild);
            rightTree.preOrderTraverse();
        }
    }

    @Override
    public void inOrderTraverse() {
        System.out.println("中序遍历:");
        this.inOrderTraverse(root);
        System.out.println();
    }

    private void inOrderTraverse(Node node) {
        if (node != null) {
            //遍历左子树
            this.inOrderTraverse(node.leftChild);
            //输出根的值
            System.out.print(node.value + " ");
            //遍历右子树
            this.inOrderTraverse(node.rightChild);
        }
    }

    @Override
    public void postOrderTraverse() {

    }

    @Override
    public void postOrderTraverse(Node node) {

    }

    @Override
    public void inOrderByStack() {
        Deque<Node> stack = new LinkedList<>();
        Node current = root;
        while (current != null || !stack.isEmpty()){
            while (current != null){
                stack.push(current);
                current = current.leftChild;
            }
            if(!stack.isEmpty()){
                current = stack.pop();
                System.out.println(current.value+" ");
                current = current.rightChild;
            }
        }
    }

    @Override
    public void preOrderByStack() {

    }

    @Override
    public void postOrderByStack() {

    }

    @Override
    public void levelOrderByStack() {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (queue.size() != 0){
            for (int i = 0; i < queue.size(); i++) {
                //遍历取出当前队列中的结点
                Node temp = queue.poll();
                //打印一下结点的值
                System.out.print(temp.value+"--");
                //把该结点的左子树加到队列中
                if (temp.leftChild != null)
                    queue.add(temp.leftChild);
                //把右子树加到队列中
                if (temp.rightChild != null)
                    queue.add(temp.rightChild);
            }
        }
    }
}
