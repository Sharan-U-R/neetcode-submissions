class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        int n=s.length();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            arr[i]=(int)c;
        }
        for(int i=1;i<n;i++){
            sum+=Math.abs(arr[i]-arr[i-1]);
        }
        return sum;
    }
}