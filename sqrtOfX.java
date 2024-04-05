/**
 * sqrtOfX
 */
public class sqrtOfX {

    public int mySqrt(int x) {
        long low=1;
        long high=x;
        while(low<=high){
            long mid=(high+low)/2;
            long val=(mid*mid);
            if(val<=x){
                low=mid+1;
            }else{
                high=mid-1;
            }
            
        }
        return (int)high;
    }
}