class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> str=new ArrayList<>();
        int n=words.length;
        int start=0;
        while(start<n){
            for(int i=0;i<n;i++){
                if(words[start].contains(words[i]) &&  start!=i ){
                    if(!str.contains(words[i]))
                    str.add(words[i]);
                }
                
            }
            start++;
        }
        return str;
        
    }
}