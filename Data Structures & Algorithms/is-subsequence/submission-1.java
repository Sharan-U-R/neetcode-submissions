class Solution {
    public boolean isSubsequence(String s, String t) {
        int spointer=0;
        int tpointer=0;
        if(s.length()==0){
            return true;
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(tpointer)==s.charAt(spointer)){
                spointer++;
                
            }
            tpointer++;
            if(spointer==s.length())
            {
                return true;
            }
        }
       return false; 
        
    }
}