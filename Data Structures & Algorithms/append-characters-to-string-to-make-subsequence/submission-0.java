class Solution {
    public int appendCharacters(String s, String t) {
        if(t.length()==0){
            return 0;
        }
        int spointer=0;
        int tpointer=0;
        while(tpointer<t.length()){
            if(spointer<s.length() && t.charAt(tpointer)==s.charAt(spointer)){
                tpointer++;
            }
            spointer++;
            if(spointer==s.length()){
                return t.length()-tpointer;
            }
        }
        return 0;
    }
}