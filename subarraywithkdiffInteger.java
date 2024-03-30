import java.util.*;
public class subarraywithkdiffInteger {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return countArray(nums, k)-countArray(nums, k-1);
    }
    public static int countArray(int nums[], int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        int s=0,e=0;
        int count=0;
        int n=nums.length;
        while(e<n){
            map.put(nums[e], map.getOrDefault(nums[e],0)+1);

            while(map.size()>k){
                map.put(nums[s], map.get(nums[s])-1);
                if(map.get(nums[s])==0){
                    map.remove(nums[s]);
                }
                s++;
            }
            count=count+(e-s+1);
             e++;
        }
        
        return count;
    }
}
