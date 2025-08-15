class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int total=n*n;
        int[] f=new int[total+1];
        for(int[] r:grid){
            for(int num:r){
                f[num]++;
            }
        }
        int r=-1,m=-1;
        for(int i=1;i<=total;i++){
            if(f[i]==2)
                r=i;
            if(f[i]==0)
                m=i;
        }
        return new int[] {r,m};
    }
}