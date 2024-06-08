public class firstAndLastOccurence {
    private int lowerBound(int[] arr, int target, int n){
        int low =0,high=n-1;
        int ans=-1;
        while(low<=high){
        int mid=(low+high)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;

            }else{
                low=mid+1;
            }
        }
        return ans;

    }

    private int upperBound(int arr[],int target,int n){
        int low =0,high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;

            }else{
                low=mid+1;
            }
        }
        return ans;

    }

    public int[] searchRange(int[] nums, int target) {
        int lb=lowerBound(nums,target,nums.length);
        if(lb==-1 || nums[lb]!=target)return new int[] {-1,-1};
        return new int[] {lb,upperBound(nums,target,nums.length)-1}; 
    }
}
