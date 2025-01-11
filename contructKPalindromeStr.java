public class contructKPalindromeStr {
    public boolean canConstruct(String s, int k) {
        if(k>s.length())return false;
        if(k==s.length())return true;
        int [] map=new int [26];
        for(char ch : s.toCharArray()){
            map[ch-'a']++;
        }
        int count=0;
        for(int nums: map){
            if(nums%2!=0)count++;
        }
        return (count<=k);
    }
} 
    

