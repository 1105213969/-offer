package questions;

/**
 * @program: 剑指offer
 * @description: 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中
 * 都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * @author: shengweiz
 * @create: 2019-10-20 15:50
 **/

public class Q4 {

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        int len = pre.length;
        return reConstructBinaryTree(pre, 0, len - 1, in, 0, len - 1);
    }

    public TreeNode reConstructBinaryTree(int [] pre, int pStart, int pEnd,
                                          int [] in, int iStart, int iEnd) {
        if (pStart > pEnd || iStart > iEnd) {
            return null;
        }
        TreeNode root = new TreeNode(pre[pStart]);
        for (int i = iStart; i <= iEnd; ++i) {
            if (in[i] == pre[pStart]) {
                root.left = reConstructBinaryTree(pre, pStart + 1, pStart + i - iStart,
                        in, iStart, i - 1);
                root.right = reConstructBinaryTree(pre, pStart + i - iStart + 1, pEnd,
                        in, i+ 1, iEnd);
            }
        }
        return root;
    }

    public void showTree(TreeNode root) {//中序遍历
        if (root == null) return;
        if (root.left != null)
            showTree(root.left);
        System.out.print(root.val + " ");
        if (root.right != null)
            showTree(root.right);
    }

    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        Q4 q4 = new Q4();
        TreeNode root = q4.reConstructBinaryTree(pre, in);
        q4.showTree(root);

    }
}
