package binary_tree;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/11/24 14:14
 * @description：验证二叉搜索树
 * https://leetcode-cn.com/problems/validate-binary-search-tree/
 *
 * 给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
 * 有效 二叉搜索树定义如下：
 *  节点的左子树只包含 小于 当前节点的数。
 *  节点的右子树只包含 大于 当前节点的数。
 *  所有左子树和右子树自身必须也是二叉搜索树。
 */
public class IsValidBST {
    public static boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if (root == null) {
            return true;
        }
        if (root.val <= minVal || root.val >= maxVal) {
            return false;
        }
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }
}
