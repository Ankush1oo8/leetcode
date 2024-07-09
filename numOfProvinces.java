public class numOfProvinces {
    private void dfs(int[][] isConnected,boolean vis[],int city){
        int n=isConnected.length;
        vis[city]=true;
        for(int i=0;i<n;i++){
            if(isConnected[city][i]==1 && !vis[i]) dfs(isConnected,vis,i);
            }
        }
    
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean vis[]=new boolean[n+1];
        int cnt=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                vis[i]=true;
                dfs(isConnected,vis,i);
                cnt++;
            }
        }
        return cnt;
    }
}
