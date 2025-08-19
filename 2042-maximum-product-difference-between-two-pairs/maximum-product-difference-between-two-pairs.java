class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max1=nums[n-1]*nums[n-2];
        int mini=nums[0]*nums[1];
        return max1-mini;
    }
}