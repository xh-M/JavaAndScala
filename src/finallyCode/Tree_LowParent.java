package finallyCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/4/19
 */
public class Tree_LowParent {
    public static void main(String[] args) {
        TreeNode root = TreeNode.getTree();
        TreeNode node1 = root.left.left;
        TreeNode node2 = root.right.right;
        TreeNode treeNode = treeLowParent(root, node1, node2);
        System.out.println(treeNode);
    }

    private static TreeNode treeLowParent(TreeNode root, TreeNode node1, TreeNode node2) {
        TreeNode node11 = findNode(root, node1);
        TreeNode node22 = findNode(root, node2);
        if (node11 == null || node22 == null) {
            return null;
        }
        TreeNode[] node1Parents = findParent(root, node11);
        TreeNode[] node2Parents = findParent(root, node22);
        System.out.println(Arrays.toString(node1Parents));
        System.out.println(Arrays.toString(node2Parents));
        for (int i = node1Parents.length - 1; i >= 0 ; i--) {
            for (int j = node2Parents.length - 1; j >= 0 ; j--) {
                if(node1Parents[i] == node2Parents[j]){
                    return node1Parents[i];
                }
            }
        }
        return null;
    }

    private static TreeNode[] findParent(TreeNode root, TreeNode node) {
        LinkedList<TreeNode> track = new LinkedList<>();
        ArrayList<TreeNode> parent = new ArrayList<>();
        backTrack(root, node, track, parent);
        TreeNode[] parents = new TreeNode[parent.size()];
        parent.toArray(parents);
        return parents;
    }

    private static void backTrack(TreeNode root, TreeNode node11,
                                  LinkedList<TreeNode> track, ArrayList<TreeNode> parent) {
        if (root == null) {
            return;
        }
        if (root == node11) {
            parent.addAll(track);
            return;
        }
        track.add(root);
        backTrack(root.left, node11, track, parent);
        backTrack(root.right, node11, track, parent);
        track.removeLast();
    }

    private static TreeNode findNode(TreeNode root, TreeNode node1) {
        if (root == null) {
            return null;
        }
        if (root == node1) {
            return root;
        }
        TreeNode left = findNode(root.left, node1);
        TreeNode right = findNode(root.right, node1);
        return left == null ? right : left;
    }
}
