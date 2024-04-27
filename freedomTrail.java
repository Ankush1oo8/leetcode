import java.util.Arrays;

public class freedomTrail {
    public int [][] memo;
    public int findRotateSteps(String ring, String key) {
        memo =new int[ring.length()][key.length()];
        for(int[]row:memo){
            Arrays.fill(row,-1);
        }
        return solve(0,0,ring,key);
    }
    public int solve(int ringIndex,int keyIndex,String ring,String key){
        if(keyIndex==key.length())return 0;
        if(memo[ringIndex][keyIndex]!=-1)return memo[ringIndex][keyIndex];
       int result = Integer.MAX_VALUE;
        for (int i = 0; i < ring.length(); i++) {
            if(ring.charAt(i)==key.charAt(keyIndex)){
                int totalCount = Math.min(Math.abs(i - ringIndex), ring.length() - Math.abs(i - ringIndex)) + 1 + solve(i, keyIndex + 1, ring, key);
                result=(Math.min(result,totalCount));
            }
        }
        memo[ringIndex][keyIndex]=result;
        return result;
    }
}
