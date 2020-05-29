package questions;

/**
 * @program: 剑指offer
 * @description:
 * 从尾到头打印链表
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * @author: shengweiz
 * @create: 2019-10-20 15:33
 **/

import java.util.ArrayList;
import java.util.Stack;

public class Q3 {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<ListNode> stack = new Stack<>();
        ListNode tmp = listNode;
        while (tmp != null) {
            stack.push(tmp);
            tmp = tmp.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            ListNode top = stack.pop();
            list.add(top.val);
        }
        return list;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next= new ListNode(3);
        ArrayList<Integer> res = new Q3().printListFromTailToHead(root);
        res.stream().forEach(a -> System.out.println(a + " "));
    }
}
