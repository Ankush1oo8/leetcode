import javax.swing.tree.TreeNode;

public class diameterOfBST {
    int diameter=0;
    private int dfs(TreeNode root){
        if(root==null)return 0;
        int left=dfs(root.left);
        int right=dfs(root.right);
        diameter=Math.max(diameter,left+right);
        return 1+Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return diameter;
    }
}
