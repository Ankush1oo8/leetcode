class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max=0;
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
         for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num)>max){
                max=map.get(num);
            }
        }
        
        for(int val:map.values()){
            if(val==max)count+=val;
        }
        return count;
    }
}