package 二叉树的最近公共祖先;
import pojo.TreeNode;
//给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
//
//百度百科中最近公共祖先的定义为：“对于有根树 T 的两个节点 p、q，最近公共祖先表示为一个节点 x，
//满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
public class Solution {


//    如果当前节点是 null 或者是目标节点之一（p 或 q），直接返回当前节点。
//    递归左右子树：
//    左子树返回值为 l，右子树返回值为 r。
//    根据左右子树的返回值判断：
//    如果左子树返回 null，说明 p 和 q 都在右子树中，返回右子树的结果。
//    如果右子树返回 null，说明 p 和 q 都在左子树中，返回左子树的结果。
//    如果左右子树都不为 null，说明当前节点就是最近公共祖先，返回当前节点。
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if(root == null || root == p || root == q)
           return root;
       TreeNode left = lowestCommonAncestor(root.left, p, q);
       TreeNode right = lowestCommonAncestor(root.right, p, q);
       if(left != null && right != null)
           return root;
       return left == null ? right : left;
    }

    public static void main(String[] args) {

    }
}
