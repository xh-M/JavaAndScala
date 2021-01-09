package Java.dataStructure.stackqueue;

/**
 * @Auther: https://segmentfault.com/u/hanli_991122
 * @Date: 2020/8/21
 * @Description: Java.dataStructure.stackqueue
 * @version: 1.0
 */

import com.sun.deploy.uitoolkit.impl.awt.AWTDragHelper;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 借助栈实现进制转换 （10--->2）
 */
public class TestConvert {
    public static void main(String[] args) {
        int t = 13;
        int n = t;
        //定义空栈，存放余数
        Deque deque = new LinkedList();
        do {
            int mod = n % 2;
            //余数入栈
            deque.push(mod);
            n = n / 2;
        }while (n != 0);
        //打印结果
        System.out.print(t+"---->");
        while (!deque.isEmpty()){
            System.out.print(deque.pop());
        }
    }
}
