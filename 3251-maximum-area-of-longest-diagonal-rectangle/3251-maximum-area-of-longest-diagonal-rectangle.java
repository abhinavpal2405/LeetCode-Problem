class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int d[][]=dimensions;
        int max=0;
        int area=0;
        for(int i =0;i<d.length;i++){
            int a = d[i][0]*d[i][0]+d[i][1]*d[i][1];
            int currarea= d[i][0]*d[i][1];
            if(a>max||(a==max && currarea>area)){
                max=a;
                area=currarea;
            }
        }
        return area;
    }
}