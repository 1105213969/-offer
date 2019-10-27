package questions;

/**
 * @program: 剑指offer
 * @description: 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * @author: shengweiz
 * @create: 2019-10-27 16:30
 **/
public class Q8 {

    public int JumpFloor(int target) {
        if (target <= 3) {
            return target;
        }
        int a = 1, b = 2, c = 3;
        for (int i = 3; i <= target; ++i) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        Q8 q8 = new Q8();
        for (int i = 0; i < 10; ++i) {
            System.out.println(q8.JumpFloor(i));
        }
    }
}
