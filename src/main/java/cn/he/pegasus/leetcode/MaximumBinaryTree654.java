package cn.he.pegasus.leetcode;

/**
 * 描述:
 * 654. Maximum Binary Tree
 *
 * @Author HeFeng
 * @Create 2018-11-09 15:31
 */
public class MaximumBinaryTree654 {

    public static void main(String[] args) {
        int[] nums = {3,2,1,6,0,5};
        MaximumBinaryTree654 object = new MaximumBinaryTree654();
        TreeNode result = object.constructMaximumBinaryTree(nums);
        System.out.println(result);
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return doWork(nums, 0, nums.length);
    }

    public TreeNode doWork(int[] nums, int left, int right){
        if(left == right){
            return null;
        }
        int maxIndex = findMax(nums,left,right);
        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = doWork(nums, left,maxIndex);
        root.right = doWork(nums, maxIndex+1,right);
        return root;

    }

    public int findMax(int[] nums, int left, int right){
        int maxIndex = left;
        for (int i = left; i < right; i++) {
            if (nums[maxIndex] < nums[i]){
                maxIndex = i;
            }
        }
        return maxIndex;

    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}