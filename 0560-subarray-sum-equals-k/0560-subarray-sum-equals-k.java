class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap <Integer,Integer>freq = new HashMap<>();
        freq.put(0,1);
        int res =0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
            if(freq.containsKey(sum-k)){
                res += freq.get(sum-k);
            }
            freq.put(sum,freq.getOrDefault(sum,0)+1);
        }
        return res;
    }
}