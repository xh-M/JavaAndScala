import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/3/29
 */

public class bianliTree {
    public static void main(String[] args) {
        new HashMap<>();
        new ConcurrentHashMap<>();
        new Hashtable<>();
        new ArrayList<>();
        new LinkedList<>();
        new HashSet<>();
//        new ThreadPoolExecutor();
        ExecutorService service = Executors.newFixedThreadPool(10);
        Executors.newCachedThreadPool();
        Executors.newSingleThreadExecutor();
//        service.execute();
        ReentrantLock reentrantLock = new ReentrantLock();

        String s = "hello worldxxxxxxxxxx";
        System.out.println(s.hashCode());
        int a = 69;
        int b = 9;
        a = a^b;//找出了不同的位, 异或计算规律1:相同的位为0 不同的位为1
        b = a^b;//a代表的是不同的位, 而b还是原来的数, 异或运算规律2: 如果左边的数为0, 那么结果是右边的数 如果左边的数为1, 结果是右边的数取反
        a = a^b;
        System.out.println("a = " + a + ", b = " + b);


//        TreeNode root = TreeNode.getTree();//{8, 6, 10 ,5, 7, 9, 11}
//        xianxubianli(root);// 8 6 5 7 10 9 11
//        zhongxubianli(root);//5 6 7 8 9 10 11
//        houxubianli(root);//5 7 6 9 11 10 8
//        houxubianlibeibeibei(root);
    }

    public static void houxubianli(TreeNode root) {
        System.out.print("后序遍历: ");
        Stack<TreeNode> stack = new Stack<>();
        TreeNode lastNode = null;
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            }
            else {
                TreeNode top = stack.peek();
                if(top.right != null && lastNode != top.right){
                    root = top.right;
                }
                else {
                    System.out.print(top.val + " ");
                    lastNode = stack.pop();
                }
            }
        }
        System.out.println();
    }

    public static void zhongxubianli(TreeNode root) {
        System.out.print("中序遍历: ");
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            }
            else {
                root = stack.pop();
                System.out.print(root.val + " ");
                root = root.right;
            }
        }
        System.out.println();
    }

    public static void xianxubianli(TreeNode root) {
        System.out.print("先序遍历: ");
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty() && root != null) {
            root = stack.pop();
            System.out.print(root.val + " ");
            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
                stack.push(root.left);
            }
        }
        System.out.println();
    }



    public  static  void  houxubianlibeibeibei(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode lastNode = null;
        while (!stack.isEmpty() || root != null){
            if(root != null){
                stack.push(root);
                root = root.left;
            }else {
                TreeNode top = stack.peek();
                if(top.right != null && top.right != lastNode){
                    root = top.right;
                }else {
                    System.out.print(top.val+ " ");
                    lastNode = stack.pop();
                }
            }
        }
    }


}


