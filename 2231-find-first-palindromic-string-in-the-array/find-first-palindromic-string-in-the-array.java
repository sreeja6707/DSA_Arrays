class Solution {
    public String firstPalindrome(String[] words) {
        for(String w:words){
            if(isPalindrome(w)){
                return w;
            }
        }
        return "";
    }
    public boolean isPalindrome(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}