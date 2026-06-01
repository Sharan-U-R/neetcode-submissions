class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=Character.toLowerCase(s.charAt(i));
            if((s.charAt(i)>='a'&& s.charAt(i)<='z') ||(s.charAt(i)>='A'&& s.charAt(i)<='Z')||(s.charAt(i)>='0' && s.charAt(i)<='9')){
                str.append(c);
            }
        }
      String newStr=str.toString();
    int start=0;
    int end=newStr.length()-1;
    while(start<=end){
        if(newStr.charAt(start)==newStr.charAt(end)){
            start++;
            end--;
        }else{
            return false;
        }
    }

    return true;
    }
}
