class Solution {
    public int numUniqueEmails(String[] emails) {
        int n=emails.length;
        Set<String> lst=new HashSet<>();
        for(String s:emails){
            StringBuilder sb=new StringBuilder();
            int index=s.indexOf('@');
            String local=s.substring(0,index);
            String domain=s.substring(index,s.length());
            for(int i=0;i<local.length();i++){
                if(local.charAt(i)=='+'){
                    break;
                }
                if(local.charAt(i)!='.'){
                    sb.append(local.charAt(i));
                }
            }
            lst.add(sb.toString()+domain);
        }
        return lst.size();
    }
}