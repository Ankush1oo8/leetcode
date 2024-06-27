public class containerWithMostWater {
    public int maxArea(int[] height) {
        int res=0;
        int l=0,r=height.length-1;
        while(l<r){
            int currArea=Math.min(height[l],height[r])*(r-l);
            res=Math.max(res,currArea);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return res;
    }
}
