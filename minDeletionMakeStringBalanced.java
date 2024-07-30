class minDeletionMakeStringBalanced {
    public int minimumDeletions(String s) {
        int dp=0,countB=0;
        for(char c:s.toCharArray()){
            if(c == 'a'){
                dp = Math.min(dp + 1, countB);
            }else{
                countB++;
            }
        }
        return dp;
    }
}