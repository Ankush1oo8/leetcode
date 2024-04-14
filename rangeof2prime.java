class rangeof2prime{
    public int maximumPrimeDifference(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            if(!isPrime(nums[left])){
                left++;
            }
             if(!isPrime(nums[right])){
                right--;
            }
            if(isPrime(nums[left]) && isPrime(nums[right])){
                return right-left;
                
            }
        }
        return 0;
    }
     public static boolean isPrime(int n) {  
       if (n <= 1) {  
           return false;  
       }  
       for (int i = 2; i <= Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true;  
   }  
}