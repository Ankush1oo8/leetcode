class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> list=new LinkedList<>();
        HashMap<Integer,Boolean>map=new HashMap<>();
        for(int i=0;i<graph.length;i++){
            if(dfs(i,graph,map)){
                list.add(i);
            }
        }
        return list;
    }
    private boolean dfs(int i,int [][]graph,HashMap<Integer,Boolean>map){
        if(map.containsKey(i)){
            return map.get(i);
        }
        map.put(i,false);
        for(int n:graph[i]){
            if(!dfs(n,graph,map)){
                return false;
            }
        }
        map.put(i,true);
        return true;
    }
}