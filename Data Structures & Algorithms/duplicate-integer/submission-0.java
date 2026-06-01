class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
            if(m.containsKey(i)){
                m.put(i,m.get(i)+1);
            }else{
                m.put(i,1);
            }
        }
        for(int val:m.values()){
            if(val>1){
                return true;
            }
        }
        return false;
    }
}