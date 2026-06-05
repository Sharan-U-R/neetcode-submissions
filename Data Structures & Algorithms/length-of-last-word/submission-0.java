class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        int count=0;
        while(i>=0 ){
            if(s.charAt(i)==' ' && !(count>0)){
                i--;
                continue;
            }else if(s.charAt(i)==' '){
                return count;
            }
            count++;
            i--;
        }
        return count;
    }
}