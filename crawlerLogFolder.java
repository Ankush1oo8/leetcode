class crawlerLogFolder{
    public int minOperations(String[] logs) {
        int depth=0;
        for(String i:logs){
            
            if(i.equals("./"))continue;
            if(i.equals("../")){
                depth=Math.max(depth-1,0);
            }else {
                depth++;
            }
        }
        return depth;
    }
}