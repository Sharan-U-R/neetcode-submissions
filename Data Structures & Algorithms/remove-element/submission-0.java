class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int start=0;
        for(int end=0;end<n;end++){
            if(nums[end]!=val){
                nums[start]=nums[end];
                start++;
            }
        }
        return start;        
    }
}