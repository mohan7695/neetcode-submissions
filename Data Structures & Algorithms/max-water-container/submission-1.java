class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right = heights.length-1;
int ans=0;
        while(left < right){

                int width =right - left;

                int heigh = Math.min(heights[left],heights[right]);

                int area = heigh * width;

                ans=Math.max(area,ans);

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
