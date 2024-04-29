public class longRepeatCharReplacement {
  
        public int characterReplacement(String s, int k) {
            int l=0;
            int r=0;
            int maxlen=0;
            int mf=0;
            int [] freq=new int[26];
            while(r<s.length()){
               freq[s.charAt(r)-'A']++;
               mf=Math.max(mf,freq[s.charAt(r)-'A']);
               int cg=(r-l+1)-mf;
               if(cg>k){
                freq[s.charAt(l)-'A']--;
                l++;
               }
              else{maxlen=Math.max(maxlen,r-l+1);}
               r++;
    
            }return maxlen;
        }
    }

