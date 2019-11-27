package questions;

/**
 * @program: 剑指offer
 * @description: 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * @author: shengweiz
 * @create: 2019-10-27 17:03
 **/
public class Q11 {

    public int NumberOf1(int n) {
       int num = 0;
       while (n != 0) {
           num++;
           n = n & (n - 1);//每进行一次操作会减少一个1
       }
       return num;
    }

    public static void main(String[] args) {
        Q11 q11 = new Q11();
        System.out.println(q11.NumberOf1(3));
        System.out.println(q11.NumberOf1(5));
        System.out.println(q11.NumberOf1(7));
    }
}
