public class balancedBT {
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
            if(height(root)==-1)return false;
            return true; 
        }
        private int height(TreeNode root){
            if(root==null)return 0;
            int right=height(root.right);
            int left=height(root.left);
            if(right==-1 || left==-1)return -1;
            if(Math.abs(right-left)>1)return -1;
            return 1+Math.max(right,left);
        }
}
//   Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

