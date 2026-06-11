class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lst=new ArrayList<>();
        if(numRows==1){
            lst.add(Arrays.asList(1));
            return lst;
        }
        lst.add(Arrays.asList(1));
        lst.add(Arrays.asList(1,1));
        while(lst.size()<numRows){
            List<Integer> temp=new ArrayList<>();
            List<Integer> prev=lst.get(lst.size()-1);
            temp.add(1);
            int i=0;
            int j=1;
            while(i<prev.size() && j<prev.size()){
                temp.add(prev.get(i)+prev.get(j));
                i++;
                j++;
            }
            temp.add(1);
            lst.add(temp);
            
        }
        return lst;
    }
}