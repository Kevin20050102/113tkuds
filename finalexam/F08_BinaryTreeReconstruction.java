import java.util.*;

public class F08_BinaryTreeReconstruction {
    static class TreeNode {
        char val;
        TreeNode left, right;
        TreeNode(char c) { val = c; }
    }

    static int preIndex = 0;
    static Map<Character, Integer> inMap = new HashMap<>();

    public static TreeNode buildTree(char[] preorder, char[] inorder, int inStart, int inEnd) {
        if (inStart > inEnd) return null;
        char rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);
        int inIndex = inMap.get(rootVal);
        root.left = buildTree(preorder, inorder, inStart, inIndex - 1);
        root.right = buildTree(preorder, inorder, inIndex + 1, inEnd);
        return root;
    }

    public static void postOrder(TreeNode root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pre = sc.nextLine();
        String in = sc.nextLine();
        char[] preorder = pre.toCharArray();
        char[] inorder = in.toCharArray();
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }
        TreeNode root = buildTree(preorder, inorder, 0, inorder.length - 1);
        postOrder(root);
        System.out.println();
    }
}
