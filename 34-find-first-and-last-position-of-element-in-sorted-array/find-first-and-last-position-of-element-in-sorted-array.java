class Solution {
    public int[] searchRange(int[] nums, int target) {
        int c=f(nums,target);
        int d=s(nums,target);
        return new int[]{c,d};
    }
    public int f(int[] nums,int target){
        int low=0,high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public int s(int[] nums,int target){
        int low=0,high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }

}