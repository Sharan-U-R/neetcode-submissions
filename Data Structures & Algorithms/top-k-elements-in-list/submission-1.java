class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length==1){
            return new int[]{nums[0]};
        }
        if(nums.length==2 && nums[0]==nums[1]){
            return new int[]{nums[0]};
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int n:nums){
            if(hm.containsKey(n)){
                hm.put(n,hm.get(n)+1);
            }else{
                hm.put(n,1);
            }
        }
        List<Map.Entry<Integer,Integer>> entry=new ArrayList<>(hm.entrySet());
        entry.sort((a,b)->Integer.compare(b.getValue(),a.getValue()));
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=entry.get(i).getKey();
        }
        return res;
    }
}
