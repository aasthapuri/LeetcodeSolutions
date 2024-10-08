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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return ans;
        q.add(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            List<Integer> al = new ArrayList<>();
            for(int i = 0;i<n;i++)
            {
                TreeNode node = q.peek();
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
                al.add(q.poll().val);
            }
            ans.add(al);
        }

        for(int i = 1;i<ans.size();i+=2){
            Collections.reverse(ans.get(i));
        }
        return ans;
        
        
    }
  
}

