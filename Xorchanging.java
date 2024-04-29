public class Xorchanging {
    public int minOperations(int[] nums, int k) {
        int finalXOR=0;
        for(int i=0;i<nums.length;i++){
            finalXOR=finalXOR^nums[i];
        }
        int count=0;
        int res=finalXOR^k;
        while(res>0){
            if(res%2==1){
                count++;
                
            }
            res=res/2;
        }
        return count;
    }
}
