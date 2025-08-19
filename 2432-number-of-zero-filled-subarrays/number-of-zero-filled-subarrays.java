class Solution {
    public long zeroFilledSubarray(int[] nums) {
        return zero(nums,0,0);
    }
    public long zero(int[] nums,int i,long s){
        if(i==nums.length){
            return 0;
        }
        if(nums[i]==0){
            s+=1;
            return s+zero(nums,i+1,s);
        }
        else{
            return zero(nums,i+1,0);
        }
    }
}