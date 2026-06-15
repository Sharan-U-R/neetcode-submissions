class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int res[]=new int[len1];
        for(int i=0;i<len2;i++){
            int k=i+1;
            boolean found=false;
            while(k<len2){
                if(nums2[k]>nums2[i]){
                    hm.put(nums2[i],nums2[k]);
                    found=true;
                    break;
                }
                k++;
            }
            if(!found){
                hm.put(nums2[i],-1);
            }
        }
        for(int i=0;i<len1;i++){
            res[i]=hm.get(nums1[i]);
        }
        return res;
    }
}