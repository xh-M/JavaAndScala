package finallyCode;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/4/18
 */
public class Tree_Deep {
    public static void main(String[] args) {
        TreeNode root = TreeNode.getTree();
        int i = treeDeep(root);
        System.out.println("树深度为: " + i);
    }

    private static int treeDeep(TreeNode root) {
        if (root == null) return 0;
        int left = treeDeep(root.left);
        int right = treeDeep(root.right);

        return left >= right? left + 1 : right + 1;
    }
}
