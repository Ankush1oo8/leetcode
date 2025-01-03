class Solution {
    public int waysToSplitArray(int[] nums) {
        long totalSum = 0;
        int splitCount = 0;

       
        for (int num : nums) {
            totalSum += num;
        }

        long leftSum = 0;
        long rightSum=0;
    
        for (int i = 0; i < nums.length - 1; i++) { 
            leftSum += nums[i];
            rightSum = totalSum - leftSum;

            if (leftSum >= rightSum) {
                splitCount++;
            }
        }

        return splitCount;
    }
}
