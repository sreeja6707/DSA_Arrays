class Solution {
    public int findTheWinner(int n, int k) {
        return 1+f(n,k);
    }
    public int f(int n,int k){
        if(n==1)
            return 0;
        return (f(n-1,k)+k)%n;
    }
}