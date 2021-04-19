package finallyCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/4/18
 */
public class Tree_BFS {
    public static void main(String[] args) {
        TreeNode root = TreeNode.getTree();

        treeBFS(root);
    }

    private static void treeBFS(TreeNode root) {
        System.out.print("树的广度优先遍历: " );
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (queue.size() != 0){
            root = queue.poll();
            System.out.print(root.val + " ");
            if(root.left != null){
                queue.offer(root.left);
            }
            if(root.right != null){
                queue.offer(root.right);
            }
        }
        System.out.println();
    }
}
