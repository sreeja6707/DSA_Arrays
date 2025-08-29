class Solution {
    public String removeOuterParentheses(String s) {
        String res="";
        int open=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(open>0){
                    res+=ch;
                }
                open++;
            }
            else{
                open--;
                if(open>0){
                    res+=ch;
                }
            }
        }
        return res;
    }
}