class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int finalAmt=0;
        for(int i=0;i<n;i++){
            int currentAmt=0;
            for(int j=i+1;j<n;j++){
                int width=j-i;
                currentAmt=width*Math.min(heights[i],heights[j]);
                if(currentAmt>finalAmt){
                    finalAmt=currentAmt;
                }
            }
        }
        return finalAmt;
    }
}
