import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class BTInorderTraversal {
     public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer>list=new ArrayList<>();
        inorder(root,list);
        return list;
    }
    private void inorder(TreeNode root, List<Integer>list){
        if(root==null)return;
        
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}
