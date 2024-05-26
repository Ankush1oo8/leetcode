class singleElementInArray {
    public int singleNonDuplicate(int[] nums) {
         int singleNum = 0;
         for (int i : nums) {
             singleNum ^= i;
         }
         
         return singleNum;
     }
 }