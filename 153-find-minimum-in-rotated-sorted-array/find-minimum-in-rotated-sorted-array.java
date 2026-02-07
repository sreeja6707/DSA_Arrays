class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            mini=Math.min(mini,nums[i]);
        }
        return mini;
        /*int low=0,high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[high]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return nums[low];*/
    }
}