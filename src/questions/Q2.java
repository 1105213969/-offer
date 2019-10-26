package questions;

/**
 * @program: 剑指offer
 * @description:
 * 替换空格
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
 * @author: shengweiz
 * @create: 2019-10-20 15:12
 **/
public class Q2 {

    public String replaceSpace(StringBuffer str) {
        int num = 0;//空格的个数
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == ' ') {
                num++;
            }
        }
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) != ' ') {//不是空格直接set
                res.append(str.charAt(i));
            } else {
                res.append("%20");
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("We are Happy");
        Q2 q2 = new Q2();
        String res = q2.replaceSpace(str);
        System.out.println(res);
    }
}
