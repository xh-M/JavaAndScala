import java.util.Stack;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/4/13
 */
public class Houxubianli {
    public static void main(String[] args) {
        TreeNode root = TreeNode.getTree();//{8, 6, 10 ,5, 7, 9, 11}
//        houxubianli(root);
//        InorderTraversal(root);
        hhhhhh(root);
    }



    private static void houxubianli(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode last = null;
        while (!stack.isEmpty() || root != null){
            if (root != null) {
                stack.push(root);
                root = root.left;
            }else {
                TreeNode top  = stack.peek();
                if(top.right != null && top.right != last){
                    root = top.right;
                }else {
                    System.out.print(top.val + " ");
                    last = stack.pop();
                }
            }
        }
    }

    private static void InorderTraversal(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null){
            if(root != null){
                stack.push(root);
                root  = root.left;
            }else{
                root = stack.pop();
                System.out.print(root.val + " ");
                root = root.right;
            }
        }
    }


    private static void  hhhhhh(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode last = null;
        while (!stack.isEmpty() || root != null){
            if (root != null) {
                stack.push(root);
                root = root.left;
            }else {
                TreeNode peek = stack.peek();
                if(peek.right != null && peek.right != last){
                    root = peek.right;
                }else {
                    System.out.print(peek.val + ",");
                    last = stack.pop();
                }
            }
        }
    }
}
