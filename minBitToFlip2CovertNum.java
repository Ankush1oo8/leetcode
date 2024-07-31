public class minBitToFlip2CovertNum {
    public int minBitFlips(int start, int goal) {
        int cnt =0;
        int bits = start ^ goal;
        for(int i=0; i<32; i++){
            if((bits&(1<<i))!=0)
                cnt++;
        }
        return cnt;
    }
}
