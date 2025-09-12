class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer>res=new ArrayList<>();
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target) {
            int left=mid,right=mid;
            while(left-1>=0 && nums[left-1]==target)
            left--;
            while(right+1<nums.length && nums[right+1]==target)
            right++;

            for(int i=left;i<=right;i++){
            res.add(i);
            }
            return res;
            }
            else if(nums[mid]>target)
            high=mid-1;
            else low=mid+1;
        }
        return res;
    }
}