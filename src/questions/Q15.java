package questions;

/**
 * 翻转链表
 */
//p->head->0->0->0

public class Q15 {
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
    
        ListNode preNode = null;
        ListNode nextNode = null;
        while (head != null){
            nextNode = head.next;
            head.next = preNode;
            preNode = head;
            head = nextNode;
        }
        return preNode;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode p = head;
        for (int i = 2; i < 5; ++i) {
            p.next = new ListNode(i);
            p = p.next;
        }
        ListNode newHead = new Q15().reverse(head);
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}