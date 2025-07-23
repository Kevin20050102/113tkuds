public class TreeMirror {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static boolean isSymmetric(TreeNode root) {
        return root == null || isMirror(root.left, root.right);
    }

    private static boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null || t2 == null) return t1 == t2;
        return t1.val == t2.val &&
               isMirror(t1.left, t2.right) &&
               isMirror(t1.right, t2.left);
    }

    public static TreeNode mirror(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = mirror(root.right);
        root.right = mirror(temp);
        return root;
    }

    public static boolean areMirrors(TreeNode t1, TreeNode t2) {
        if (t1 == null || t2 == null) return t1 == t2;
        return t1.val == t2.val &&
               areMirrors(t1.left, t2.right) &&
               areMirrors(t1.right, t2.left);
    }
}
