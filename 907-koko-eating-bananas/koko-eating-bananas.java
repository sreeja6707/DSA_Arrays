class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=findMax(piles);
        while(low<=high){
            int mid=(low+high)/2;
            int totalH=calTotalHrs(piles,mid);
            if(totalH<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static int findMax(int[] piles){
        int n=piles.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,piles[i]);
        }
        return maxi;
    }
    public static int calTotalHrs(int[] piles,int h){
        int totalH=0;
        int n=piles.length;
        for(int i=0;i<n;i++){
            totalH+=Math.ceil((double)(piles[i])/(double)(h));
        }
        return totalH;
    }
}