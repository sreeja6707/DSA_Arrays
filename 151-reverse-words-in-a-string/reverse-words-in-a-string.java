class Solution {
    public String reverse(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        return rev;
    }
    public String reverseWords(String s) {
        // Code here
        String temp="";
        String ans="";
        int i=s.length()-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)!=' '){
                temp+=s.charAt(i);
                i--;
            }
            if(temp!=""){
                ans+=reverse(temp)+' ';
                temp="";
            }
            i--;
        }
        return ans.substring(0,ans.length()-1);
    }
}