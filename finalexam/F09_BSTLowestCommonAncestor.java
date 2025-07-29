import java.util.*;

public class F09_BSTLowestCommonAncestor {
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

    public static TreeNode lca(TreeNode root, int p, int q) {
        if (p < root.val && q < root.val) return lca(root.left, p, q);
        if (p > root.val && q > root.val) return lca(root.right, p, q);
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeNode root = null;
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(lca(root, p, q).val);
    }
}
