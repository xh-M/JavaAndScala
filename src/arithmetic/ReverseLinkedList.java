package arithmetic;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/3/26
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "val=" + val +
                ", next=" + next ;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        reverseDiGui(node3, node4);

        for (ListNode p = node1; p != null; p = p.next) {
            System.out.print(p.val + " ");
        }


    }

    private static ListNode reverse(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    static ListNode successor = null;
    private static ListNode reverseN(ListNode head, int n){

        if(n == 1){
            successor = head.next;
            return head;
        }
        ListNode last = reverseN(head.next, n - 1);
        head.next.next = head;
        head.next = successor;
        return last;
    }


    private static ListNode reverseDiGui(ListNode a, ListNode b) {
        ListNode pre, cur, nxt;
        ListNode temp = b.next;
        pre = b.next; cur = a; nxt = a;
        while (cur != temp) {
            nxt = cur.next;
            // 逐个结点反转
            cur.next = pre;
            // 更新指针位置
            pre = cur;
            cur = nxt;
        }
//        a.next = pre;
        // 返回反转后的头结点
        return pre;
    }
}
