public class maxPointsObtainFromCard {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0;
        int rsum=0;
        int maxSum=0;
        int rIndex=cardPoints.length-1;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        maxSum=lsum;
         for(int i=k-1;i>=0;i--){
            lsum-=cardPoints[i];
            rsum+=cardPoints[rIndex];
            rIndex--;
            maxSum=Math.max(maxSum,lsum+rsum);
         }
         return maxSum;
    }
}
