class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size()!=s.length())
        return false;
        for(int c=0;c<words.size();c++){
            if(words.get(c).charAt(0)!=s.charAt(c)){
            return false;
        }
        }
        return true;
    }
}