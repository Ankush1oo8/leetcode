import java.util.LinkedList;
import java.util.Queue;

public class countCompleteTreeNodes {

    public int countNodes(TreeNode root) {
        int count=0;
        if(root==null)return count;
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            count++;
            if(node.left!=null){
                q.offer(node.left);
            }
            if(node.right!=null){
                q.offer(node.right);
            }
        }
        return count;
    }   
}
