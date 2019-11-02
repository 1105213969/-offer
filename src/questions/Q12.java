package questions;

/**
 * @program: 剑指offer
 * @description: 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。  保证base和exponent不同时为0
 * @author: shengweiz
 * @create: 2019-11-02 09:36
 **/
public class Q12 {

    public double Power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            return doPower(base, exponent);
        } else {
           return 1 / doPower(base, 0 - exponent);
       }
    }

    public double doPower(double base, int exponent) {
        if (exponent == 1) {
            return base;
        }
        if (exponent % 2 == 1) {//奇数
            return doPower(base, exponent >> 1 ) * doPower(base, exponent >> 1) * base;
        } else {
            return doPower(base, exponent >> 1 ) * doPower(base, exponent >> 1);
        }
    }

    public static void main(String[] args) {
        Q12 q12 = new Q12();
        System.out.println(q12.Power(3, 3));
        System.out.println(q12.Power(1.2, 2));
        System.out.println(q12.Power(2, -1));
    }
}
