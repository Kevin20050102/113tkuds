public class SimpleBST {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public static TreeNode insert(TreeNode root, int value) {
        if (root == null) return new TreeNode(value);

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static boolean search(TreeNode root, int target) {
        if (root == null) return false;
        if (root.data == target) return true;

        if (target < root.data) {
            return search(root.left, target);
        } else {
            return search(root.right, target);
        }
    }

    public static void main(String[] args) {
        int[] values = {50, 30, 70, 20, 40, 60, 80, 35};
        TreeNode root = null;
        for (int v : values) {
            root = insert(root, v);
        }

        int[] targets = {30, 35, 60, 80, 25, 90};
        System.out.println("搜尋結果:");
        for (int t : targets) {
            System.out.printf("  搜尋 %d: %b%n", t, search(root, t));
        }
    }
}
