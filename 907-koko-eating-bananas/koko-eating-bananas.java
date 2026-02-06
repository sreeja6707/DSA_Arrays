class Solution {
    public int findMax(int[] piles){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            maxi=Math.max(piles[i],maxi);
        }
        return maxi;
    }
    public int ceilt(int[] piles,int hour){
        int totalH=0;
        int n=piles.length;
        for(int i=0;i<n;i++){
            totalH+=Math.ceil((double)(piles[i])/(double)(hour));
        }
        return totalH;
    }
    public int eat(int[] piles,int h){
        int maxi=findMax(piles);
        for(int i=0;i<=maxi;i++){
            int r=ceilt(piles,h);
            if(r<=h){
                return i;
            }
          }
          return maxi;
        }
        public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=findMax(piles);
        while(low<=high){
            int mid=(low+high)/2;
            int totalH=ceilt(piles,mid);
            if(totalH<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
    return low;

    }
}