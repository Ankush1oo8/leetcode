public class minWindowSubstring {
    public String minWindow(String s, String t) {
        int []arr=new int[256];
        int count=0;
        int r=0,l=0,minlen=Integer.MAX_VALUE,sIndex=-1;
        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)]++;
        }
        while(r<s.length()){
            if(arr[s.charAt(r)]>0) count++;
            arr[s.charAt(r)]--;
            while(count==t.length()){
                if(r-l+1<minlen){
                    minlen=r-l+1;
                    sIndex=l;
                }
                arr[s.charAt(l)]++;
                if(arr[s.charAt(l)]>0)count--;
                l++;
            }
            r++;
        }
        return sIndex==-1?"":s.substring(sIndex,sIndex+minlen);
    }
}
