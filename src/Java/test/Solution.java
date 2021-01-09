package Java.test;

import java.util.ArrayList;

/**
 * @Auther: 孟祥辉
 * @Date: 2020/11/1
 * @Description: Java.test
 * @version: 1.0
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> integers = new ArrayList<>();
        while (listNode.next != null){
            integers.add(listNode.val);
            listNode = listNode.next;
        }


        return  integers;
    }

    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("efg");
        String s3 = s1 + s2;//堆内存
        String s4 = "abcefg";//常量池
        String s5 = "abc" + "efg";//常量池
        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s4 == s5);

    }
}