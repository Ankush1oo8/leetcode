public class SquareOfSortedArray {
    public static int [] sq(int nums[]){
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > nums[right]) {
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={-4,-1,0,3,10};
        
        sq(arr);
        
    }
}
