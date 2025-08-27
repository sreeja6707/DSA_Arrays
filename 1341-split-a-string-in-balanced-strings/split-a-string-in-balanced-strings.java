class Solution {
    public int balancedStringSplit(String s) {
        int r=0;
        int l=0;
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                r++;
                
            }
            if(s.charAt(i)=='L'){
                    l++;
                }
            if(l==r){
                cnt++;
            }
        }
        return cnt;
    }
}