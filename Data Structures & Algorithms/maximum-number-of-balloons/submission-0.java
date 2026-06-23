class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }else{
                hm.put(c,1);
            }
        }
        Map<Character,Integer> balloon=new HashMap<>();
        for(char c:"balloon".toCharArray()){
            balloon.put(c,balloon.getOrDefault(c,0)+1);
        }
        int res=text.length();
        for(char c:balloon.keySet()){
            res=Math.min(res,hm.getOrDefault(c,0)/balloon.get(c));
        }
        return res;

    }
}