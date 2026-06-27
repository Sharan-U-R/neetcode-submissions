class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map=new LinkedHashMap<>();
        int n=arr.length;
        for(String s:arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int count=0;
        for(String s:map.keySet()){
            if(map.get(s)==1){
                count++;
                if(count==k){
                    return s;
                }
            }
        }
        return "";
    }
}