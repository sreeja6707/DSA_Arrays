class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int cnt=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                cnt++;
            }
            else if(nums[i]>0){
                max++;
            }
        }
        return Math.max(max,cnt);
    }
}