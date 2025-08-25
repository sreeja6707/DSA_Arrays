class Solution {
    public int maxFreqSum(String s) {
        int f[]=new int[26];
        for(char c:s.toCharArray()){
            f[c-'a']++;
        }
        int maxV=0,maxC=0;
        for(int i=0;i<26;i++){
            char ch=(char)(i+'a');
            if("aeiou".indexOf(ch)!=-1){
                maxV=Math.max(maxV,f[i]);
            }
            else{
                maxC=Math.max(maxC,f[i]);
            }
        }
        return maxV+maxC;
    }
}