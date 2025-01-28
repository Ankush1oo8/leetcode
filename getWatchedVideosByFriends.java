public class getWatchedVideosByFriends {
        class Pair implements Comparable<Pair>{
            String v;
            int f;
            public Pair(String v,int f){
                this.f=f;
                this.v=v;
            }
            public int compareTo(Pair that){
                if(this.f==that.f){
                    return this.v.compareTo(that.v);
                }
                return this.f-that.f;
            }
        }
        public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
            Queue<Integer>q=new LinkedList<>();
            HashSet<Integer>set=new HashSet<>();
            q.offer(id);
            set.add(id);
            int currlevel=0;
            while(!q.isEmpty()){
                int size=q.size();
                while(size>0){
                    int curId=q.poll();
                    for(int friend:friends[curId]){
                        if(!set.contains(friend)){
                            q.offer(friend);
                            set.add(friend);
                        }
                    }
                    size--;
                }
                currlevel++;
                if(currlevel==level){
                    break;
                }
            }
            HashMap<String,Integer>map=new HashMap<>();
            while(!q.isEmpty()){
                int currId=q.poll();
                for(String v:watchedVideos.get(currId)){
                    map.put(v,map.getOrDefault(v,0)+1);
                }
            }
            List<Pair>list=new ArrayList<>();
            for(String v:map.keySet()){
                list.add(new Pair(v,map.get(v)));
            }
            Collections.sort(list);
            List<String>res=new ArrayList<>();
            for(Pair pair:list){
                res.add(pair.v);
            }
            return res;
        }
    
}
