class Solution {
    public int maxArea(int[] height) {
      int st=0;
      int lt=height.length-1;
      int area=0;
      while(st < lt){
        if(height[st]<height[lt]){
            int a= height[st]*(lt-st);
            area=Math.max(area,a);
            st++;
        }else{
            int b= height[lt]*(lt-st);
            area=Math.max(b,area);
            lt--;
        }
      }
    return area;
    }
}