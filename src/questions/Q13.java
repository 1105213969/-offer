package questions;

//调整数组顺序使奇数位于偶数前面
public class Q13 {

    //冒泡思想，如果两个数相邻，前面一个是偶数，后面一个是奇数就交换
    public void reOrderArray(int [] array) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] % 2 == 0 && array[j+1] % 2 != 0) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7,8,0,3,5};
        Q13 q13 = new Q13();
        q13.reOrderArray(arr);
        for (int tmp : arr) {
            System.out.print(tmp + " ");
        }
    }
}