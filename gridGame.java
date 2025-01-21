public class gridGame {
    public long gridGame(int[][] grid) {
        long frow=0;
        for(int n:grid[0])frow+=n;
        long srow=0;
        long res=Long.MAX_VALUE;
        for(int i=0;i<grid[0].length;i++){
            frow-=grid[0][i];
            res=Math.min(Math.max(frow,srow),res);
            srow+=grid[1][i];
        }
        return res;
    }
}
