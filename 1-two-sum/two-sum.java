class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<n;i++){
            int x=nums[i];
            int more=target-x;
            if(h.containsKey(more)){
                return new int[]{h.get(more),i};
            }
            h.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}