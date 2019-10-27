package questions;

/**
 * @program: 剑指offer
 * @description: 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author: shengweiz
 * @create: 2019-10-27 16:47
 **/
public class Q9 {

    public int JumpFloorII(int target) {
        if (target == 0 || target == 1) {
            return target;
        }
        return 2 * JumpFloorII(target - 1);
    }

    public static void main(String[] args) {
        Q9 q9 = new Q9();
        for (int i = 0; i < 10; ++i) {
            System.out.println(q9.JumpFloorII(i));
        }
    }
}
