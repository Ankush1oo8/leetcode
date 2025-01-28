public class maxNumberofFishInGrid {

        public int findMaxFish(int[][] grid) {
            int ans=0;
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]!=0){
                        ans=Math.max(ans,dfs(i,j,grid));
                    }
                }
            }
            return ans;
        }
        private int dfs(int i,int j,int [][]grid){
            if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0){
                return 0;
            }
            int ans=grid[i][j];
            grid[i][j]=0;
            ans+=dfs(i-1,j,grid);
            ans+=dfs(i,j-1,grid);
            ans+=dfs(i,j+1,grid);
            ans+=dfs(i+1,j,grid);
            return ans;
        }
    
}
