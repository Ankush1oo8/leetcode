class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean visit[][]=new boolean [image.length][image[0].length];
        int init=image[sr][sc];
        dfs(visit,sr,sc,image,color,init);
        return image;
    }
    private void dfs(boolean visit[][], int sr, int sc,int[][] image, int color,int init){
        if(sr<0 || sr>=image.length || sc<0 ||sc>=image[0].length || image[sr][sc]!=init||visit[sr][sc]){
            return;
        }
        visit[sr][sc]=true;
        image[sr][sc]=color;
        dfs(visit,sr-1,sc,image,color,init);
        dfs(visit,sr+1,sc,image,color,init);
        dfs(visit,sr,sc-1,image,color,init);
        dfs(visit,sr,sc+1,image,color,init);
    }
}