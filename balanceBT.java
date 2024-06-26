public class balanceBT {
    private void inorder(TreeNode root,ArrayList<Integer>inorder){
        if(root==null){
            return;
        }
        inorder(root.left,inorder);
        inorder.add(root.val);
        inorder(root.right,inorder);
    }
    private TreeNode buildBST(ArrayList<Integer>inorder,int start,int end){
        if(start>end){
            return null;
        }
        int mid=start+(end-start)/2;
        TreeNode node=new TreeNode (inorder.get(mid));
        node.left=buildBST(inorder,start,mid-1);
        node.right=buildBST(inorder,mid+1,end);
        return node;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer>inorder=new ArrayList<>();
        inorder(root,inorder);
        return buildBST(inorder,0,inorder.size()-1);
    }
}
