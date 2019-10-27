package questions;

/**
 * @program: 剑指offer
 * @description: 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 * @author: shengweiz
 * @create: 2019-10-27 16:23
 **/
public class Q7 {

    public int Fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int a = 0, b = 1, c = 1;
        for (int i = 2; i <= n; ++i) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        Q7 q7 = new Q7();
        for (int i = 0; i < 10; ++i) {
            System.out.println(q7.Fibonacci(i));
        }
    }
}
