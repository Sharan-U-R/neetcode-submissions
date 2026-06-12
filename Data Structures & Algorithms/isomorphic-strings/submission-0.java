class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> stotmap=new HashMap<>();
        Map<Character,Character> ttosmap=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(stotmap.containsKey(c1)){
                if(stotmap.get(c1)!=c2){
                    return false;
                }
            }else{
                stotmap.put(c1,c2);
            }

            if(ttosmap.containsKey(c2)){
                if(ttosmap.get(c2)!=c1){
                    return false;
                }
            }else{
                ttosmap.put(c2,c1);
            }

        }
        return true;

    }
}