public class jumpGameII {
    public int jump(int[] nums) {
        int jump=0,l=0,r=0;
        while(r<nums.length-1){
            int farthest=0;
            for(int i=l;i<=r;i++){
                farthest=Math.max(farthest,i+nums[i]);
            }
            l=r+1;
            jump++;
            r=farthest;
        }
        return jump;
    }
}
