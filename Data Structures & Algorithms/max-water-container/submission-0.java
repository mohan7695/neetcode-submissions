class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right = heights.length-1;
int ans=0;
        while(left < right){

                int total =right - left;

                int heigh = Math.min(heights[left],heights[right]);

                int width = heigh * total;

                ans=Math.max(width,ans);

                if(heights[left] < heights[right]){
                    left++;
                }
                else{
                    right--;
                }
        }
        return ans;
    }
}
