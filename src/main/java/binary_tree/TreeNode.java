package binary_tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/11/1 15:27
 * @description：
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    // 创建二叉树
    public static TreeNode createBinaryTree(LinkedList<Integer> list) {
        TreeNode node = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Integer data = list.removeFirst();
        if (data != null) {
            node = new TreeNode(data);
            node.left = createBinaryTree(list);
            node.right = createBinaryTree(list);
        }
        return node;
    }

    // 前序
    public static void preOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    // 中序
    public static void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.val+" ");
        inOrderTraversal(node.right);
    }

    //后序
    public static void postOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.val+" ");
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, null, null, 4, 5, null, 6, null, null, 7, null, null));
        TreeNode treeNode = createBinaryTree(list);
        System.out.println("前序遍历：");
        preOrderTraversal(treeNode);
        System.out.println("\n中序遍历：");
        inOrderTraversal(treeNode);
        System.out.println("\n后序遍历：");
        postOrderTraversal(treeNode);
        System.out.println();

    }
}
