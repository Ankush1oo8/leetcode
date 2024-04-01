public class lengthOfLastWord {
    public int lengthOfLastWord(String s) {
       
        int ans=0;
        int n=s.length()-1;
        while(n>=0){
            if(s.charAt(n)==' '){
                if(ans==0){
                    n--;
                }else{
                    break;
                }
            }else{
                ans++;
                n--;
            }
        }
        
        return ans;
    }
}
