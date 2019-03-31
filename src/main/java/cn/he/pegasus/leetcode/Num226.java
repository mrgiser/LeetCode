package cn.he.pegasus.leetcode;

/**
 * 描述:翻转一棵二叉树。
 *
 * @Author he
 * @Create 2019-03-30 4:48 PM
 */
public class Num226 {
    public TreeNode invertTree(TreeNode root) {

        if (root == null)
            return null;


        TreeNode left = invertTree(root.right);
        TreeNode right = invertTree(root.left);

        root.left = left;
        root.right = right;

        return root;
    }

}