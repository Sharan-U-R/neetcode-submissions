class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String s:operations){
            if(s.equals("+")){
                int top=st.peek();
                int prev=st.get(st.size()-2);
                st.push(top+prev);
            }else if(s.equals("C")){
                st.pop();
            }else if(s.equals("D")){
                int top=st.peek();
                st.push(2*top);
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        int sum=0;
        for(int i:st){
            sum+=i;
        }
        return sum;
    }
}