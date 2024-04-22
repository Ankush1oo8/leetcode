public class openTheLock {
    public int openLock(String[] deadends, String target) {
        Set<String>dead=new HashSet<>(Arrays.asList(deadends));                             
        List<String>queue=new ArrayList<>();
        queue.add("0000");
        Set<String>seen=new HashSet<>();
        seen.add("0000");
        int depth=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                String node=queue.remove(0);
                if(node.equals(target)){
                    return depth;
                }
                if(!dead.contains(node)){
                    for(int j=0;j<4;j++){
                        for(int d=-1;d<=1;d+=2){
                            int y=((node.charAt(j)-'0')+d+10)%10;
                            String nei=node.substring(0,j)+(""+y)+node.substring(j+1);
                            if(!seen.contains(nei)){
                                seen.add(nei);
                                queue.add(nei);
                            }
                        }
                    }
                }
            }
            depth++;
        }
    return -1;
    }
}
