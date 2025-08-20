class Solution {
    public char kthCharacter(int k) {
        return characterk(k);
    }
    public char characterk(int k){
        if(k==1)
            return 'a';
        long len=1;
        while(len<k){
            len*=2;
        }
        long h=len/2;
        if(k<=h){
            return characterk((int)k);
        }
        else{
            char prev=characterk((int)(k-h));
            return prev=='z'?'a':(char)(prev+1);
        }
    }
}