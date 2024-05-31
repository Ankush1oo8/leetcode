public class candy {
    public int candy(int[] ratings) {
        int n=ratings.length;
        if(n==1)return 1;
        int arr[]=new int [n];
        Arrays.fill(arr,1);
        for(int i=0;i<n-1;i++){
            if(ratings[i+1]>ratings[i]){
                arr[i+1]=arr[i]+1;
            }
        }
        for(int i=n-1;i>0;i--){
            if(ratings[i-1]>ratings[i] && arr[i-1]<=arr[i]+1){
                arr[i-1]=arr[i]+1;
            }
        }
        int ans=0;
        for(int i:arr){
            ans+=i;
        }
        return ans;

    }
}
