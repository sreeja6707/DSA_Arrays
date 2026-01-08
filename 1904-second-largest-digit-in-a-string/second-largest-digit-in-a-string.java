class Solution {
    public int secondHighest(String s) {
        int max=-1;
        int smax=-1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                int sec=c-'0';
                if(sec>max){
                    smax=max;
                    max=sec;
                }
                else if(sec>smax && sec<max){
                    smax=sec;
                }

            }
        }
        return smax;
    }
}