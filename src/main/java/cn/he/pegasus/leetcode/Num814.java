package cn.he.pegasus.leetcode;

/**
 * 描述:给定二叉树根结点 root ，此外树的每个结点的值要么是 0，要么是 1。
 *
 * 返回移除了所有不包含 1 的子树的原二叉树。
 *
 * ( 节点 X 的子树为 X 本身，以及所有 X 的后代。)
 *
 * @Author he
 * @Create 2019-03-30 4:37 PM
 */
public class Num814 {

    public TreeNode pruneTree(TreeNode root) {

        if (root == null)
            return null;

        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);

        if (root.val == 0 && root.left ==null && root.right == null)
            return null;
        return root;
    }
}