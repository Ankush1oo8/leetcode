import java.util.Collections;

class twoSum{
    public static int[] twosum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    int arr[]={i,j};
                    return arr;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        int tar=9;
        System.out.println(twosum(nums,tar));
    }
}