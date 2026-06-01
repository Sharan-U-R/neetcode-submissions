class Solution {

    public String encode(List<String> strs) {
        StringBuilder str=new StringBuilder();
        for(String i :strs){
            int s=i.length();
            str.append(String.format("%04d",s)).append(i);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> res=new ArrayList<>();
        if(str==null || str.isEmpty()){
            return res;
        }
        int i=0;
        while(i<str.length()){
            int len=Integer.parseInt(str.substring(i,i+4));
            i+=4;
            String word=str.substring(i,i+len);
            res.add(word);
            i+=len;
        }
        return res;

    }
}
