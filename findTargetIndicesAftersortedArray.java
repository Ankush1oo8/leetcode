import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findTargetIndicesAftersortedArray {
      public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> targetIndices = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                targetIndices.add(i);
            }
        }
        return targetIndices;
    }
}
