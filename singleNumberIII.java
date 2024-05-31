class singleNumberIII{
    public int[] singleNumber(int[] nums) {
        long xor=0;
        for(int i:nums){
            xor^=i;
        }
        long mask=(xor) & (-xor);
        int g1=0;
        int g2=0;
        for(int i:nums){
            if((i & mask)==0){
                g1^=i;
            }else{
                g2^=i;
            }
        }
        return new int[] {g1,g2};
    }
}