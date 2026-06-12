class Solution {
    public int countSeniors(String[] details) {
        int n=details.length;
        int count=0;
        for(String s:details){
            if(s.length()==0){
                continue;
            }
            int age=Integer.parseInt(s.substring(11,13));
            if(age>60){
                count++;
            }
        }
        return count;
    }
}