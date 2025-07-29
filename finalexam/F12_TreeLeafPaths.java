import java.util.*;

public class F12_TreeLeafPaths {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    public static void dfs(TreeNode node, String path, List<String> result) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            result.add(path + node.val);
            return;
        }
        dfs(node.left, path + node.val + "->", result);
        dfs(node.right, path + node.val + "->", result);
    }

    public static TreeNode buildLevelOrder(int[] values) {
        if (values.length == 0) return null;
        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        while (i < values.length) {
            TreeNode curr = queue.poll();
            if (i < values.length && values[i] != -1) {
                curr.left = new TreeNode(values[i]);
                queue.offer(curr.left);
            }
            i++;
            if (i < values.length && values[i] != -1) {
                curr.right = new TreeNode(values[i]);
                queue.offer(curr.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nodes = new int[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = sc.nextInt(); // -1 表示 null
        }
        TreeNode root = buildLevelOrder(nodes);
        List<String> paths = new ArrayList<>();
        dfs(root, "", paths);
        for (String path : paths) {
            System.out.println(path);
        }
    }
}
