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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return new ArrayList<List<Integer>>();
        ArrayList<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        
        
        
        q.add(root);
        
        while(!q.isEmpty()){
            int n = q.size();
            
            List<Integer> treeList = new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode newNode = q.poll();
                treeList.add(newNode.val);
                if(newNode.left!=null) q.add(newNode.left);
                if(newNode.right!=null) q.add(newNode.right);
                
            }
            list.add(treeList);
        }
        return list;
    }
}

        