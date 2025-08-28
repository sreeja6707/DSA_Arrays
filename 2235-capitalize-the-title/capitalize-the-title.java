class Solution {
    public String capitalizeTitle(String title) {
        String res="";
        String s[]=title.split(" ");
        for(int i=0;i<s.length;i++){
            String w=s[i].toLowerCase();
            if(w.length()>2){
            w=w.substring(0,1).toUpperCase()+w.substring(1);
        }
        res+=w;
        if(i!=s.length-1){
            res+=" ";
        }
        }
        return res;
    }
}