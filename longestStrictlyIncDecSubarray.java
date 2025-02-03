class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length==0)return 0;
        int max=1,inc=1,dec=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                dec=1;
                inc++;
            }else if(nums[i-1]>nums[i]){
                inc=1;
                dec++;
            }else{
                inc=1;
                dec=1;
            }
            max=Math.max(Math.max(inc,dec),max);
        }
        return max;
    }
}