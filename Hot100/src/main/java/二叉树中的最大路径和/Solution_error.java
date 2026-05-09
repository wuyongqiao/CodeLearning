package 二叉树中的最大路径和;

import pojo.TreeNode;

class Solution_error {
    public int maxPathSum(TreeNode root) {
        if(root == null) return Integer.MIN_VALUE;
        // 找到左侧最大路径和以及右侧最大路径和
        int leftMax = maxPathSum(root.left);
        int rightMax = maxPathSum(root.right);
        // 最大路径和 = max(左侧最大路径和, 右侧最大路径和,root.val, 左侧最大路径和 + 右侧最大路径和 + root.val)
        return Math.max(leftMax , Math.max(rightMax, Math.max(root.val , leftMax + rightMax + root.val)));
    }
   public static void main(String[] args) {
        Solution_error solution = new Solution_error();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        System.out.println(solution.maxPathSum(root));
    }
}