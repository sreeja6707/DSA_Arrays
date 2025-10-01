class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n<=2) return n;

        int ans=2;
            for(int j=2;j<n;j++){
                if(nums[j]!=nums[ans-2]){
                    nums[ans]=nums[j];
                    ans++;
                }
            }
            return ans;
        
    }
}