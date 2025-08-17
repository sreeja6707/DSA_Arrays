class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int cnt=0;
        for(int num=low;num<=high;num++){
            String s=String.valueOf(num);
            int len=s.length();
            if(len%2==1)
            continue;
            int half=len/2;
            int l=0,r=0;
            for(int i=0;i<half;i++){
                l+=s.charAt(i)-'0';
                r+=s.charAt(i+half)-'0';
            }
            if(l==r)
            cnt++;
        }
        return cnt;
    }
}