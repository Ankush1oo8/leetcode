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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null)return false;
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        int child=0;
        while(!q.isEmpty()){
            int size=q.size();
            child=0;
            for(int i=0;i<size;i++){
                int parent=0;
                TreeNode node=q.poll();
                if(node.left!=null){
                    if(node.left.val==x || node.left.val==y){
                        parent++;
                        child++;
                    }
                    q.offer(node.left);
                }
                 if(node.right!=null){
                    if(node.right.val==x || node.right.val==y){
                        parent++;
                        child++;
                    }
                    q.offer(node.right);
                }
                if(parent==2)return false;
            }
            if(child==2)return true;
            if(child>2)return false;
        }
        return false;
    }
}