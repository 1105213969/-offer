package questions;

/**
 * 合并两个有序链表
 */
public class Q16 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode newList = new ListNode(0);
        ListNode p = newList;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                p.next = list1;
                list1 = list1.next;
            } else {
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }
        p.next = (list1 == null) ? list2 : list1;
        return newList.next;
    }
}