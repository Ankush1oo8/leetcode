class Solution {
    public int maxScore(String s) {
        int once=0;
        for(char ch : s.toCharArray()){
            if(ch=='1')once++;
        }
        int zeros=0;
        int res=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                zeros++;
            }else{
                once--;
            }
            res=Math.max(res,once+zeros);
        }
        return res;
    }
}