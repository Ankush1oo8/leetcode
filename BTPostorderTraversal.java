import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class BTPostorderTraversal {
     public List<Integer> postorderTraversal(TreeNode root) {
      List<Integer>list=new ArrayList<>();
        postorder(root,list);
        return list;
    }
    private void postorder(TreeNode root, List<Integer>list){
        if(root==null)return;
       
        postorder(root.left,list);
        postorder(root.right,list);
         list.add(root.val);
    }
}
