public class countingSubarraymaxEleappearKtimes {
    public long countSubarrays(int[] nums, int k){
        int maxElement=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            maxElement=Math.max(maxElement, nums[i]);
        }
        int s=0,e=0,freq=0;
        long count=0;
        while(e<n){
            if(nums[e]==maxElement){
                freq=freq+1;
            }
            while(freq==k){
                count=count+(n-e);
                if(nums[s]==maxElement){
                    freq--;
                    
                }
                s++;
            }
            e++;
        }
        return count;
    }
}
