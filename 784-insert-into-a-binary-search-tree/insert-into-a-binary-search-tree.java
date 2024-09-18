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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
        }
        TreeNode current = root;
        TreeNode node = new TreeNode(val);
        while(current!=null){
            if(val<current.val){
                if(current.left==null){
                    current.left = node;
                    break;
                }
                else current = current.left;
                
            }
            else if(val>current.val){
                if(current.right==null){
                    current.right = node;
                    break;
                }
                else current = current.right;
                
            }
        }
        return root;
    }
}