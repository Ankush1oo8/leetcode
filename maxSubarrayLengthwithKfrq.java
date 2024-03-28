import java.util.HashMap;

class maxSubarrayLengthwithKfrq{
    public int maxSubarrayLength(int[] nums, int k){
        int n=nums.length;
        int start=0,end=0;
        int maxLength=0;
       
        HashMap<Integer,Integer>map=new HashMap<>();
        while(end<n){
            map.put(nums[end], map.getOrDefault(nums[end], 0)+1);

            while(map.get(nums[end])>k){
                map.put(nums[start], map.get(nums[start])-1);
                start++;
            }
            maxLength=Math.max(end-start+1, maxLength);
            end++;
        }
        return maxLength;
    }
}
/* second method to do the same in less time
 * 
 * public int maxSubarrayLength(int[] nums, int k) {
    HashMap<Integer, Integer> freq = new HashMap<>();
    int ans  = 0;
    for(int i = 0, j = 0; j < nums.length; ++j){
        freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
        while(freq.get(nums[j]) > k){
            freq.put(nums[i], freq.get(nums[i]) - 1);
            ++i;
        }
        ans = Math.max(ans, j - i + 1);
    }
    return ans;
}
}
 */