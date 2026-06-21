class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
         for(int i:nums){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
         }
         for(int i=1;i<=n;i++){
            if(!hm.containsKey(i)){
                list.add(i);
            }
         }
         return list;
    }
}