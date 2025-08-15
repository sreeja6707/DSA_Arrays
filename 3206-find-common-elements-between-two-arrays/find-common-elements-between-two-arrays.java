class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer>s1=new HashSet<>();
        for(int num:nums1)
            s1.add(num);
        Set<Integer>s2=new HashSet<>();
        for(int num:nums2)
            s2.add(num);
        int c1=0;
        int c2=0;
        for(int num:nums1){
            if(s2.contains(num))
                c1++;
        }
        for(int num:nums2){
            if(s1.contains(num))
                c2++;
        }
        return new int[]{c1,c2};
    }
}