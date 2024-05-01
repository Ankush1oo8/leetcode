public class palindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        String str = Integer.toString(x);
        char []a=str.toCharArray();
        int left=0;
        int right=a.length-1;
        while(left<right){
            if(a[left]!=a[right])return false;
            left++;
            right--;
        }
        return true;
    }
}
