class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer>mp=new HashMap<>();
        int prefixSum=0,cnt=0;
        mp.put(0,1);
        for(int i=0;i<n;i++){
            prefixSum+=nums[i];
            int remove=prefixSum-k;
            cnt +=mp.getOrDefault(remove,0);
            mp.put(prefixSum,mp.getOrDefault(prefixSum,0)+1);
        }
        return cnt;
    }
}