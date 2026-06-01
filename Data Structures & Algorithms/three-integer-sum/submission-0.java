class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int start=i+1;
            int right=nums.length-1;
        while(start<right){
            int sum=nums[i]+nums[start]+nums[right];
            if(sum==0){
                res.add(Arrays.asList(nums[i],nums[start],nums[right]));
                start++;
                right--;
                while(start < right && nums[start] == nums[start - 1]){
                        start++;
                }

                while(start < right && nums[right] == nums[right + 1]){
                        right--;
                }
            }else if(sum<0){
                start++;
            }else{
                right--;
            }
        }            
            
        }
    return res;
       
    }
}
