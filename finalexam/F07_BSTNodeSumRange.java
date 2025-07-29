import java.util.*;

public class F07_BSTNodeSumRange {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.val) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }

    public static int rangeSum(TreeNode root, int low, int high) {
        if (root == null) return 0;
        if (root.val < low) return rangeSum(root.right, low, high);
        if (root.val > high) return rangeSum(root.left, low, high);
        return root.val + rangeSum(root.left, low, high) + rangeSum(root.right, low, high);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeNode root = null;
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }
        int low = sc.nextInt();
        int high = sc.nextInt();
        System.out.println(rangeSum(root, low, high));
    }
}
