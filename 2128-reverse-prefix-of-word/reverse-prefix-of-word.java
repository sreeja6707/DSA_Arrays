class Solution {
    public String reversePrefix(String word, char ch) {
        String rev="";
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                for(int j=i;j>=0;j--){
                rev+=word.charAt(j);
                }
                rev+=word.substring(i+1);
                return rev;
            }
        }
        return word;
    }
}