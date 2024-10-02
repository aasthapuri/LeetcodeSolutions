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
    List<Integer> list = new ArrayList<>();
    void inOrder(TreeNode root){
        if(root.left!=null){
            inOrder(root.left);
        }
        list.add(root.val);
        if(root.right!=null){
            inOrder(root.right);
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root);
        
        return list.get(k-1);
    }
}