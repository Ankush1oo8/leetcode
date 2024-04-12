public class mounatinrange {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int ans = 0;
        int max = -1;
    
        if (n < 3) {
            return 0;
        }
    
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                int left = i - 1;
                int right = i + 1;
    
                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }
    
                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }
    
                ans = Math.max(ans, right - left + 1);
            }
        }
    
        return ans;
    }
}
