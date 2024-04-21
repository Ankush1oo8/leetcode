public class pathExist {
    boolean flag =false;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(n==1)return true;
        Map<Integer,List<Integer>>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList());
        }
        for(int [] edge : edges){
            map.get(edge[0]).add(edge[1]);
             map.get(edge[1]).add(edge[0]);
        }
        boolean []vis=new boolean[n];
        dfs(map,vis,source,destination);
        return flag;
    }
    public void dfs(Map<Integer,List<Integer>>map,boolean[] vis, int start,int end){
        if(vis[start] ||flag){
            return;
        }
        vis[start]=true;
        for(int nei :map.get(start)){
            if(nei==end){
                flag=true;
                break;
            }
            if(!vis[nei]){
                dfs(map,vis,nei,end);
            }
        }
    }
}

// better solution
/*
 *   public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(edges.length == 0) return true;
        boolean[] visited = new boolean[n];
        boolean flag = true;
        visited[source] = true;
    while(flag){
        flag = false;
        for(int[] edge : edges){
            if(visited[edge[0]] != visited[edge[1]]){
                visited[edge[0]] = true;
                visited[edge[1]] = true;
                flag = true;
            }
            if(visited[destination]) return true;
        }
    }
    return false;
    }
 */