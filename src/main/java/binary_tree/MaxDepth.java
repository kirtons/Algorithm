package binary_tree;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/11/1 15:30
 * @description：二叉树的最大深度 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class MaxDepth {
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        int maxLeft = maxDepth(root.left);
        int maxRight = maxDepth(root.right);

        if (maxLeft > maxRight) {
            return maxLeft + 1;
        } else {
            return maxRight + 1;
        }
    }
}
