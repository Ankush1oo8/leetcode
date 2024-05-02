import java.util.Arrays;
import java.util.HashSet;

public class LargePositivewithItsNegative {
//     public int findMaxK(int[] nums) {
       
//         int val=-1;
        
//         HashSet<Integer>set=new HashSet<>();
//         for(int num:nums){
//             if(num<0) set.add(num);
//         }
//         for(int i=0;i<nums.length;i++){
//             if(set.contains(-nums[i])){
//                 val=nums[i];
//             }
//         }
//         return val;
//     }
  public int findMaxK(int[] nums) {
       
        int val=-1;
        Arrays.sort(nums);
        int i=0;
        HashSet<Integer>set=new HashSet<>();
        while(i<nums.length){
            if(nums[i]<0) set.add(nums[i]);
            if(nums[i]>=0)break;
            i++;
        }
        while(i<nums.length){
            if(set.contains(-nums[i])){
                val=nums[i];
            }
            i++;
        }
        return val;
    }
}
