import javax.swing.tree.TreeNode;

public class sameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q==null){
            return true;
        }
        if(p==null || q==null || p.val!=q.val){
            return false;
        }
        return isSameTree(p.right,q.right) && isSameTree(p.left,q.left);
    }
}
