public class maxOnces {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count=0;
                continue;
            }
            count++;
           max=Math.max(max,count);
        }
        return Math.max(max,count);
    }
}
