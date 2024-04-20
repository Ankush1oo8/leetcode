public class sumMiddleOfArray {
    public int findMiddleIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int left=0;
        for(int i=0;i<nums.length;i++){
            int right=sum-left-nums[i];
            if(right==left){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}
