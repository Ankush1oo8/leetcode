public class countNiceSubstrings {
    public int numberOfSubarrays(int[] nums, int k) {
        return count(nums,k)-count(nums,k-1);
    }
    public int count(int []nums,int goal){
          if(goal<0)return 0;
            int r=0,l=0,count=0,sum=0;
          while(r<nums.length){
              sum+=(nums[r]%2);
              while(sum>goal){
                  sum-=(nums[l]%2);
                  l++;
              }
              count+=r-l+1;
              r++;
          }
          return count;
      }
}
