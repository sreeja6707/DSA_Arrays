class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxD=-1;
        int maxA=-1;
        for(int d[]:dimensions){
            int w=d[0],h=d[1];
            int dia=w*w+h*h;
            int a=w*h;
            if(dia>maxD){
                maxD=dia;
                maxA=a;
            }
            else if(dia==maxD){
                maxA=Math.max(maxA,a);
            }
        }
        return maxA;
    }
}