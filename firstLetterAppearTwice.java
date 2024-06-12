class firstLetterAppearTwice {
    public char repeatedCharacter(String s) {
        int[] seen=new int[26];
        for (char ch: s.toCharArray()){
            if(seen[ch-'a']==1)return ch;
            else{
                seen[ch-'a']=1;
            }
        }
        return 'a';
    }
}