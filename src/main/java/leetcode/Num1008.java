package main.java.leetcode;

import java.util.Stack;

/**
 * 描述: 返回与给定先序遍历 preorder 相匹配的二叉搜索树（binary search tree）的根结点
 *
 * @Author he
 * @Create 2019-03-30 3:25 PM
 */
public class Num1008 {
//    public TreeNode bstFromPreorder(int[] preorder) {
//        if (preorder.length == 0)
//            return null;
//        return bst(preorder,0,preorder.length-1);
//    }
//
//    private TreeNode bst(int[] preorder, int start, int end){
//        if(start > end){
//            return null;
//        }
//
//        int tmp = end+1;
//        for(int i = start+1;i<=end;i++ ){
//            if (preorder[i] > preorder[start]){
//                tmp = i;
//                break;
//            }
//        }
//
//        TreeNode node = new TreeNode(preorder[start]);
//        node.left = bst(preorder,start+1,tmp -1);
//        node.right = bst(preorder, tmp,end);
//        return node;
//
//    }


    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder.length == 0)
            return null;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode root = new TreeNode(preorder[0]);
        stack.push(root);

        for (int i = 1; i < preorder.length; i++) {
            TreeNode node = new TreeNode(preorder[i]);
            if (preorder[i] < stack.peek().val) {
                stack.peek().left = node;
            }
            else{
                TreeNode parent = stack.peek();
                while (!stack.isEmpty() && preorder[i]> stack.peek().val){
                    parent = stack.pop();
                }
                parent.right = node;
            }

            stack.push(node);
        }
        return root;
    }

}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}