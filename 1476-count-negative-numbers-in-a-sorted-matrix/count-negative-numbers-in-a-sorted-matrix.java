class Solution {
    public int countNegatives(int[][] grid) {
        int cnt=0;
        int m=grid.length;
        int n=grid[0].length;
        int r=0,c=n-1;
        while(r<m && c>=0){
            if(grid[r][c]<0){
                cnt+=(m-r);
                c--;

            }else{
                r++;
            }
            
        }
        return cnt;
    }
}