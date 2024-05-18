import javax.swing.tree.TreeNode;

public class DistributeCoinInBT {
    public int distributeCoins(TreeNode root) {
    dfs(root);
    return ans;
  }

  int ans = 0;

  // Returns the number of coins I can give (positive) / take (negative).
   int dfs(TreeNode root) {
    if (root == null)
      return 0;

     int l = dfs(root.left);
     int r = dfs(root.right);
    ans += Math.abs(l) + Math.abs(r);

    return (root.val - 1) + l + r;
  }
}
