/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int[] state = {k, -1};
        dfs(root, state);
        return state[1];
    }

    private void dfs(TreeNode root, int[] state) {
        if(root == null || state[0] == 0) {
            return;
        }

        dfs(root.left, state);

        if(--state[0] == 0) {
            state[1] = root.val;
            return;
        }

        dfs(root.right, state);
    }
}
