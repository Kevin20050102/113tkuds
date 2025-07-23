public class BSTKthElement {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    static int count = 0;
    static int result = -1;

    public static int kthSmallest(TreeNode root, int k) {
        count = 0;
        result = -1;
        inOrder(root, k);
        return result;
    }

    private static void inOrder(TreeNode node, int k) {
        if (node == null || result != -1) return;
        inOrder(node.left, k);
        count++;
        if (count == k) {
            result = node.val;
            return;
        }
        inOrder(node.right, k);
    }
}
