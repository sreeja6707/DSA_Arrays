class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n=operations.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                cnt+=1;
            }
            else{
                cnt-=1;
            }
        }
        return cnt;
    }
}