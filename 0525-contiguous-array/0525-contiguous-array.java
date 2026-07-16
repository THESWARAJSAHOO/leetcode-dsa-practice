class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>freq = new HashMap<>();
        freq.put(0,-1);
        int maxsum=0,sum=0;
        for(int i =0;i<nums.length;i++){
            sum += (nums[i]==0)?-1:1;
            if(freq.containsKey(sum)){
                maxsum = Math.max(maxsum,i-freq.get(sum));
            }
            else{
                freq.put(sum,i);
            }
        }
        return maxsum;
    }
}