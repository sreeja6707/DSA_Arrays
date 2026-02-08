class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        if (k > n)
            return -1;
        int low=findMax(nums);
        int high=sumN(nums);
        while(low<=high){
            int mid=(low+high)/2;
                if(maxpages(nums,mid)>k){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
        }
        return low;
    }
    public int findMax(int[] arr){
        int n=arr.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return maxi;
    }
    public int sumN(int[] arr){
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public int maxpages(int[] arr, int k){
        int stud=1;int pages=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(pages+arr[i]<=k){
                pages+=arr[i];
            }
            else{
                stud++;
                pages=arr[i];
            }
        }
        return stud;
    }
}