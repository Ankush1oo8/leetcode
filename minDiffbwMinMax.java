class minDiffbwMinMax{
     public int minDifference(int[] nums) {
        if(nums.length<=4){
            return 0;
        }
        Arrays.sort(nums);
        return Math.min(Math.min(nums[nums.length-2]-nums[2],nums[nums.length-1]-nums[3]),Math.min(nums[nums.length-4]-nums[0],nums[nums.length-3]-nums[1]));
    }
}