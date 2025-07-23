import java.util.*;

public class TreeReconstruction {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static TreeNode buildTree(int[] inorder, int[] preorder) {
        Map<Integer, Integer> inMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++)
            inMap.put(inorder[i], i);
        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inMap);
    }

    private static TreeNode build(int[] pre, int preL, int preR,
                                  int[] in, int inL, int inR,
                                  Map<Integer, Integer> inMap) {
        if (preL > preR || inL > inR) return null;

        int rootVal = pre[preL];
        TreeNode root = new TreeNode(rootVal);
        int inIdx = inMap.get(rootVal);
        int leftSize = inIdx - inL;

        root.left = build(pre, preL + 1, preL + leftSize, in, inL, inIdx - 1, inMap);
        root.right = build(pre, preL + leftSize + 1, preR, in, inIdx + 1, inR, inMap);
        return root;
    }
}
