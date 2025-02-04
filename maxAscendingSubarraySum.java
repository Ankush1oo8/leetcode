public class maxAscendingSubarraySum {
  
        public int maxAscendingSum(int[] nums) {
            int maxSum=0;
            int sum=nums[0];
            for(int i=1;i<nums.length;i++){
                if(nums[i]>nums[i-1]){
                    sum+=nums[i];
                }else{
                    
                    sum=nums[i];
                }
                maxSum=Math.max(maxSum,sum);
            }
            return maxSum;
        }
    
}
