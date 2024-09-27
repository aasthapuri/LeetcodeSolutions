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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode current;
        while(q.peek() != null){
            current = q.poll();
            q.add(current.left);
            q.add(current.right);
        }
         while (!q.isEmpty() && q.peek() == null) {
            q.poll();
        }
        return q.isEmpty();
    }
}