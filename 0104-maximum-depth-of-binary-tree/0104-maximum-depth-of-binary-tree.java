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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return 0;
        q.offer(root);
        int currentLevel = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            ans.add(new ArrayList<>());
            for (int i = 0; i < len; i++) {
                TreeNode node = q.poll();
                ans.get(currentLevel).add(node.val);
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
            }
            currentLevel++;
        }
        return currentLevel;
    }
}