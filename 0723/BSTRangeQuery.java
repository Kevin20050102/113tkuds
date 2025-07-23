import java.util.*;

public class BSTRangeQuery {
    static class TreeNode {
        int data;
        TreeNode left, right;
        TreeNode(int data) { this.data = data; }
    }

    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.data) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }

    public static void rangeQuery(TreeNode root, int min, int max, List<Integer> result) {
        if (root == null) return;
        if (root.data > min) rangeQuery(root.left, min, max, result);
        if (root.data >= min && root.data <= max) result.add(root.data);
        if (root.data < max) rangeQuery(root.right, min, max, result);
    }

    public static void main(String[] args) {
        int[] values = {20, 10, 30, 5, 15, 25, 35};
        TreeNode root = null;
        for (int val : values) root = insert(root, val);

        List<Integer> result = new ArrayList<>();
        rangeQuery(root, 12, 27, result);
        System.out.println("查詢 [12, 27] 範圍內的節點值: " + result); // [15, 20, 25]
    }
}
