class Solution {
    public String decodeMessage(String key, String message) {
        int mp[]=new int[26];
        for(int i=0;i<26;i++){
            mp[i]=-1;
        }
        int idx=0;
        for(int i=0;i<key.length();i++){
            char ch=key.charAt(i);
            if(ch!=' '){
                int pos=ch-'a';
                if(mp[pos]==-1){
                    mp[pos]=idx;
                    idx++;
                }
            }
        }
        String res="";
        for(int i=0;i<message.length();i++){
            char ch=message.charAt(i);
            if(ch==' '){
                res+=" ";
            }
            else{
                int pos=ch-'a';
                res+=(char)('a'+mp[pos]);
            }
        }
        return res;
    }
}