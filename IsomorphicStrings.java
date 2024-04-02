import java.util.Arrays;

/**
 * IsomorphicStrings
 */
public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
       int stoT[]=new int[128];
        int ttoS[]=new int[128];
        Arrays.fill(stoT,-1);
        Arrays.fill(ttoS,-1);
        StringBuilder sbS=new StringBuilder(s);
        StringBuilder sbT=new StringBuilder(t);
        for(int i=0;i<s.length();i++){
            char s1=sbS.charAt(i);
            char t1=sbT.charAt(i);
            if(stoT[s1]==-1){
                stoT[s1]=t1;
            }
            if(ttoS[t1]==-1){
                ttoS[t1]=s1;
            }
            if(stoT[s1]!=t1 || ttoS[t1]!=s1){
                return false;
            }

        }
        return true;
    }
}
/*
 * Alternate solution
 *     public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length())
            return false;

        int [] tempS = new int[127];
        int [] tempT = new int[127];
        for(int i = 0; i < s.length(); i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if(tempS[charS] != tempT[charT])
                return false;

            tempS[charS] = i + 1;
            tempT[charT] = i + 1;
        }
        return true;
    }
 */