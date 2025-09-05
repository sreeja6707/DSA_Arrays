class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        for(int r=1;r<=numRows;r++){
            ans.add(generateRow(r));
        }
        return ans;
    }
    public static List<Integer>generateRow(int row){
        long ans=1;
        List<Integer>ansR=new ArrayList<>();
        ansR.add(1);
        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/col;
            ansR.add((int)ans);
        }
        return ansR;
    }
}