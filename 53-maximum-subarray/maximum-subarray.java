class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        int prefix=0,suffix=0;
        for(int i=0;i<n;i++){
            if(prefix<0){
                prefix=0;
            }
            if(suffix<0){
                suffix=0;
            }
            prefix=prefix+nums[i];
            suffix=suffix+nums[n-i-1];
            maxi=Math.max(maxi,Math.max(prefix,suffix));
        }
        return maxi;
    }
}