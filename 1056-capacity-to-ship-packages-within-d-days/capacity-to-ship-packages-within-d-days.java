class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxi=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
            maxi=Math.max(maxi,weights[i]);
        }
        int low=maxi,high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            if(funDays(weights,mid)<=days){
                high=mid-1;;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static int funDays(int weights[],int cap){
        int days=1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>cap){
                days=days+1;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return days;
    }
}