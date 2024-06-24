class minNumKConsecutiveBitFlips {
    public int minKBitFlips(int[] nums, int k) {
        int ans=0;
        int flip_count=0;
        for(int i=0;i<nums.length;i++){
           if (i >= k && nums[i - k] == 2)
        --flip_count;
      if (flip_count % 2 == nums[i]) {
        if (i + k > nums.length)
          return -1;
        ++ans;
        ++flip_count;
        nums[i] = 2;
      }
    }

    return ans;
  }
}
