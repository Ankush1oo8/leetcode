class MHT{
    
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
     if(n==1){
        return new ArrayList<>(Arrays.asList(0));
     }
        List<Integer>[]graph=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        int degree[]=new int[n];
        for(int []edge:edges){
            int a=edge[0],b=edge[1];
            graph[a].add(b);
            graph[b].add(a);
            degree[a]++;
            degree[b]++;
        }
        Queue<Integer>que=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(degree[i]==1){
                que.offer(i);
            }
        }
        List<Integer>ans=new ArrayList<>();
        while(!que.isEmpty()){
            ans.clear();
            int size=que.size();
            for(int i=0;i<size;i++){
                int node=que.poll();
                ans.add(node);
                for(int nei:graph[node]){
                    degree[nei]--;
                    if(degree[nei]==1){
                        que.offer(nei);
                    }
                }
        }
        
    }
    return ans;
}

}