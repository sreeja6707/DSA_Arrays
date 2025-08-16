class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i[]:image){
            int l=0,r=i.length-1;
            while(l<=r){
                int lV=i[l]^1;
                int rV=i[r]^1;
                i[l]=rV;
                i[r]=lV;
                l++;
                r--;
            }
        }
        return image;
    }
}