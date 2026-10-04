class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int max=0;

        while(left<right){
            int h=right-left;
            int width=Math.min(heights[left],heights[right]);

            int area=h*width;
            max=Math.max(area,max);

            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }

        return max;
    }
}
