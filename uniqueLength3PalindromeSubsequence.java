class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer>first=new HashMap<>();
        HashMap<Character,Integer>last=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!first.containsKey(s.charAt(i))){
                first.put(s.charAt(i),i);
            }
                last.put(s.charAt(i),i);
            
        }
        int cnt=0;
        for(char ch:first.keySet()){
            int start=first.get(ch);
            int end=last.get(ch);
            if(end>start+1){
                HashSet<Character> uniqueChars = new HashSet<>();
                for (int i = start + 1; i < end; i++) {
                    uniqueChars.add(s.charAt(i));
                }
                cnt+=uniqueChars.size();
            }
        }
        return cnt;
    }
}