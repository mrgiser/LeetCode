package cn.he.pegasus.leetcode;

/**
 * 描述:
 *
 * @Author he
 * @Create 2019-03-30 5:21 PM
 */
public class Num543 {
    int res =0;
    public int diameterOfBinaryTree(TreeNode root) {
        doing(root);
        return res;
    }

    private int doing(TreeNode node){
        if (node ==null)
            return 0;

        int left = node.left==null?0:doing(node.left)+1;
        int right = node.right==null?0:doing(node.right)+1;

        res = Math.max(res, left+right);
        return Math.max(left,right);

    }
}