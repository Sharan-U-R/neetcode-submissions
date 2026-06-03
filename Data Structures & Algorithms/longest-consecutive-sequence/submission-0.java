class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(nums[i]);
        }
        int MaxSeq=0;
        for(int num:hs){
            if(!hs.contains(num-1)){
                int current=num;
                int len=1;
                while(hs.contains(current+1)){
            current++;
            len++;
        }
        MaxSeq=Math.max(MaxSeq,len);
            }
            
        }
        
    return MaxSeq;
}
}
