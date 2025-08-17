class Solution {
    public int pivotInteger(int n) {
        int t=n*(n+1)/2;
        int l=0;
        for(int x=1;x<=n;x++){
            l+=x;
            int r=t-l+x;
            if(l==r){
                return x;
            }
        }
        return -1;
    }
}