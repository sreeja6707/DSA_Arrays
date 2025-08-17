class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n=piles.length;
        int sum=0;
        int l=0;
        int r=n-1;
        while(l<r){
            r--;
            sum+=piles[r];
            r--;
            l++;
        }
        return sum;
    }
}