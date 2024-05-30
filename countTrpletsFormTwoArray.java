public class countTrpletsFormTwoArray {
    public int countTriplets(int[] arr) {
        int n=arr.length;
        int[]pre=new int[n+1];
        int ans=0;
        for (int i = 0; i < n; ++i) {
            pre[i + 1] = pre[i] ^ arr[i];
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j;k<n;k++){
                    int a=pre[j]^pre[i];
                    int b=pre[k+1]^pre[j];
                    if(a==b){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
//better solution
// public int countTriplets(int[] nums) {
       
//     int count = 0;

//     for(int i = 0; i < nums.length; i++){
//         int xor = 0;
//         for(int j = i; j < nums.length; j++){
//             xor ^= nums[j];
//             if(xor == 0) count += (j - i);
//         }
//     }
    
//     return count;
// }
