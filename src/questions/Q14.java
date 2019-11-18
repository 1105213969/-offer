package questions;

/**
 * 输出链表的倒数第K个节点
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Q14 {

    private int lengthOfList(ListNode head) {
        int i = 0;
        while (head != null) {
            ++i;
            head = head.next;
        }
        return i;
    }

    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null || k == 0 || k > lengthOfList(head)) {
            return null;
        }
        ListNode p = head;
        ListNode q = head;
        int i = 0;
        while (i < k) {
             q = q.next;
             i++;
        }
        while (q != null) {
            p = p.next;
            q = q.next;
        }
        return p;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode p = head;
        for (int i = 2; i <= 5; ++i) {
            p.next = new ListNode(i);
            p = p.next;
        }
        p = head;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        Q14 q14 = new Q14();
        ListNode kNode = q14.FindKthToTail(head, 1);
        System.out.println(kNode.val);
    }
}