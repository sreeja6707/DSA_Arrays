class Solution {
    public boolean place(int[] pos,int dis,int c){
        int n=pos.length;
        int cntc=1;
        int last=pos[0];
        for(int i=1;i<n;i++){
            if(pos[i]-last>=dis){
                cntc++;
                last=pos[i];
            }
            if(cntc>=c){
                return true;
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        int low=1,high=position[n-1]-position[0];
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
                if(place(position,mid,m)){
                    ans=mid;
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            return ans;
    }
}