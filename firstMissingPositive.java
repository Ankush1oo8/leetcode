import java.util.*;
public class firstMissingPositive {
    public static int misiingPositive(int nums[]){
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<=0 || nums[i]>=(n+1)){
                nums[i]=n+1;
            }
        }
        
        for(int i=0;i<n;i++){
            int e=Math.abs(nums[i]);
            if(e==n+1){
                continue;
            }
            int seat=e-1;
            if(nums[seat]>0){
                nums[seat]=-nums[seat];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return n+1;
    }
}
