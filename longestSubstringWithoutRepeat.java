import java.util.HashMap;

public class longestSubstringWithoutRepeat {
     public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();

        int left=0;
        int right=0;
        int count=0;
        while(right<s.length()){
            if(map.containsKey(s.charAt(right))){
                left=Math.max(map.get(s.charAt(right))+1,left);
            }
            map.put(s.charAt(right),right);
            count=Math.max(count,right-left+1);
            right++;
            }
            return count;
        }
}
