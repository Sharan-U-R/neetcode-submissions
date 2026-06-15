class Solution {
    public int maxDifference(String s) {
        int n=s.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }else{
                hm.put(s.charAt(i),1);
            }
        }
        int maxOdd=Integer.MIN_VALUE;
        int mineven=Integer.MAX_VALUE;
        for(int i:hm.values()){
            if(i%2==0 && i<mineven){
                mineven=i;
            } 
            if(i%2!=0 && i>maxOdd){
                maxOdd=i;
            }
        }
        return maxOdd-mineven;
    }
}