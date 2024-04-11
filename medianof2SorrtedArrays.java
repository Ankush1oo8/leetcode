public class medianof2SorrtedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int result[]=new int[nums1.length+nums2.length];
        int n1=0;
        int n2=0;
        int i=0;
       while(n1<nums1.length && n2<nums2.length){
        if(nums1[n1]<=nums2[n2] ){
            result[i]=(nums1[n1]);
            if(n1<nums1.length)
                n1++;
        }else {
            result[i]=(nums2[n2]);
            if(n2<nums2.length)
                n2++;
        }
        i++;
       }
       int r=result.length;
       if(r%2!=0){
        return result[r/2];
       }else{
        return (double)(result[(r/2)-1]+result[r/2])/2;
       }
      }
}
