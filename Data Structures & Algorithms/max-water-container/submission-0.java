class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int i = 0,j=n-1;
        int maxStore = 0;
        while(i<j){
            int w = j-i;
            int h = Math.min(heights[i],heights[j]);
            maxStore = Math.max(w*h,maxStore);
            if(heights[i]<heights[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxStore;
    }
}
