class binarySearch{
    public int search(int[] nums, int target) {
        int left=0;
        int high=nums.length-1;
        int ans=-1;
        while(left <= high){
            int mid=(left+high)/2;
            if(nums[mid]==target){
                ans=mid;
                return mid;
            }else if(nums[mid]<target){
               left=mid+1;
            }else {
                high=mid-1;
            }
        }
        return ans;
    }
}