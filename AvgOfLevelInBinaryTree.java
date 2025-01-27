import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AvgOfLevelInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>list=new LinkedList<>();
        if(root==null)return list;
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            int div=size;
            double total=0;
            while(size>0){
                TreeNode node=q.poll();
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
                total+=(double)(node.val);
                size--;
            }

            list.add(total/div);
        }
        return list;
    }
}

