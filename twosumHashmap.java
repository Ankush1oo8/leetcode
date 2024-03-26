import java.util.*;
class Solution {
    public int[] twosumHashmap(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n=target-nums[i];
            if(map.containsKey(n)){
                return new int[] {map.get(n),i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}