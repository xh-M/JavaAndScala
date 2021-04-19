package finallyCode;

import java.util.Stack;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/4/18
 */
public class Tree_Traverse {
    public static void main(String[] args) {
        TreeNode root = TreeNode.getTree();
        firstTraverse(root);
        middleTraverse(root);
        backTraverse(root);
    }


    public static void firstTraverse(TreeNode root){
        System.out.print("先序遍历: ");
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty() && root != null){
            root = stack.pop();
            System.out.print(root.val + " ");
            if (root.right != null) stack.push(root.right);
            if(root.left != null) stack.push(root.left);
        }
        System.out.println();
    }

    public static void middleTraverse(TreeNode root){
        System.out.print("中序遍历: ");
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null){
            if(root != null){
                stack.push(root);
                root = root.left;
            }else {
                root = stack.pop();
                System.out.print(root.val + " ");
                root  = root.right;
            }
        }
        System.out.println();
    }

    public static void backTraverse(TreeNode root){
        System.out.print("后续遍历: ");
        Stack<TreeNode> stack = new Stack<>();
        TreeNode last = null;
        while (!stack.isEmpty() || root != null){
            if(root != null){
                stack.push(root);
                root = root.left;
            }else {
                TreeNode pop = stack.peek();
                if(pop.right != null && pop.right != last){
                    root = pop.right;
                }else {
                    System.out.print(pop.val + " ");
                    last = stack.pop();
                }
            }
        }
        System.out.println();
    }
}
