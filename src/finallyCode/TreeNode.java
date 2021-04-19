package finallyCode;

import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/4/8
 */
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                '}';
    }

    public TreeNode(int val) {
        this.val = val;

    }
//    {8, 6, 10 ,5, 7, 9, 11}
    public static TreeNode getTree(){
        TreeNode root = new TreeNode(8);
        TreeNode node1 = new TreeNode(6);
        TreeNode node2 = new TreeNode(10);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(7);
        TreeNode node5 = new TreeNode(9);
        TreeNode node6 = new TreeNode(11);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        return root;
    }


}
