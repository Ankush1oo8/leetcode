public class smallestStringsFleaf {
    String smallString="";
    public String smallestFromLeaf(TreeNode root) {
        dfs(root,"");
        return smallString;
    }
    public void dfs(TreeNode root, String s ){
        if(root==null){
            return;
        }
        char ch=(char)(root.val+'a');
        s=ch+s;
        if(root.left==null && root.right==null){
            if(smallString==""){
                smallString=s;
            }else if(smallString.compareTo(s)>0){
                smallString=s;
            }
            return;
        }
        dfs(root.left,s);
        dfs(root.right,s);
    }
}
