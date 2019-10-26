package questions;

import java.util.Stack;

/**
 * @program: 剑指offer
 * @description: 两个栈实现队列
 * @author: shengweiz
 * @create: 2019-10-26 10:57
 **/
public class Q5 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        int res = 0;
        if (!stack2.isEmpty()) {
            res = stack2.pop();
        } else {
            while (!stack1.isEmpty()) {
                int node = stack1.pop();
                stack2.push(node);
            }
            res = stack2.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        Q5 queue = new Q5();
        for (int i = 0; i < 5; ++i) {
            queue.push(i);
        }
        for (int i = 0; i < 5; ++i) {
            System.out.println(queue.pop());
        }
    }
}
