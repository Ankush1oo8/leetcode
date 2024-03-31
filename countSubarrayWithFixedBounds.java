/**
 * countSubarrayWithFixedBounds
 */
public class countSubarrayWithFixedBounds {

    public long countSubarrays(int[] nums, int minK, int maxK) {
        int minI=-1;
        int maxI=-1;
        long count=0;
        int leftbouond=-1;
        int n=nums.length;
        for(int curr=0;curr<n;curr++){
            if(nums[curr]==minK){
                minI=curr;
            }
            if(nums[curr]==maxK){
                maxI=curr;
            }
            if(nums[curr]<minK || nums[curr]>maxK){
                leftbouond=curr;
            }
            if(maxI!=-1 && minI!=-1){
                int smaller=Math.min(maxI, minI);
                if(smaller-leftbouond>0){
                    count=count+smaller-leftbouond;
                }
            }

        }
        return count;
    }

}