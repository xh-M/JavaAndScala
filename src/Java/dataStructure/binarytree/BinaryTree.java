package Java.dataStructure.binarytree;

/**
 * @Auther: https://segmentfault.com/u/hanli_991122
 * @Date: 2020/8/31
 * @Description: Java.dataStructure.binarytree
 * @version: 1.0
 * 二叉树接口，可以有不用的实现类，每个类可以使用不同的存储结构，比如顺序存储，链式存储（二叉链表，三叉链表）
 */
public interface BinaryTree {
    //是否空树
    public boolean isEmpty();
    //树结点数量
    public int size();
    //获取二叉树高度
    public int getHeight();
    //查询指定值的结点;查找
    public Node findKey(int value);
    //前序递归遍历
    public void preOrderTraverse();
    //中序递归遍历
    public void inOrderTraverse();
    //后续递归遍历
    public void postOrderTraverse();
    //后续递归遍历，node是根节点
    public void postOrderTraverse(Node node);
    /**
     * 中序遍历非递归操作
     * 1、对于
     */
    public void inOrderByStack();
    /**
     * 前序遍历非递归操作
     */
    public void preOrderByStack();
    /**
     * 后序遍历非递归操作
     */
    public void postOrderByStack();
    //按照层次遍历二叉树
    public void levelOrderByStack();

}
