class Solution {
    public long flowerGame(int n, int m) {
        long ox=(n+1)/2;
        long ex=n/2;
        long oy=(m+1)/2;
        long ey=m/2;
        return ox*ey+ex*oy;
    }
}