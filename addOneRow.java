public class addOneRow {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode node=new TreeNode(val);
            node.left=root;
            return node;
        }
        TreeNode newNode=dfs(root,1,depth,val);
        return newNode;
    }

    public static TreeNode dfs(TreeNode root,int currDep,int depth,int val){
        if(root==null){
            return root;
        }
        if(currDep==depth-1){
            TreeNode newLeft=new TreeNode(val);
            newLeft.left=root.left;
            root.left=newLeft;
            TreeNode newRight=new TreeNode(val);
            newRight.right=root.right;
            root.right=newRight;
            return root;

        }
        dfs(root.left,currDep+1,depth,val);
        dfs(root.right,currDep+1,depth,val);
        return root;
    }
}
