package cn.he.pegasus.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:树的最大宽度
 *
 * @Author he
 * @Create 2019-03-30 7:27 PM
 */
public class Num662 {
    int res = 0;
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        List<Integer> left = new ArrayList<Integer>();
        doing(root,1,1,left);

        return res;
    }

    private void doing(TreeNode node, int level, int index, List<Integer> left){
        if (node == null)
            return ;

        if (level > left.size()) left.add(index);

        res = Math.max(res, node.val - left.get(level-1) +1);
        doing(node.left,level+1, index*2,left);
        doing(node.right, level+1, index*2+1, left);

    }
}