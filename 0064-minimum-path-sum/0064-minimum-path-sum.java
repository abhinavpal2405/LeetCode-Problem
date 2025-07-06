class Solution {
    public int minPathSum(int[][] grid) {
        int dp[][]=new int[grid.length][grid[0].length];

        return solve(grid,0,0,dp);
    }
    public int solve(int[][] grid,int i,int j,int[][] dp){
        if(i==grid.length-1 && j==grid[0].length-1){
            return grid[i][j];
        }
        if(i>=grid.length || j>=grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        int min=Integer.MAX_VALUE;
        int left=solve(grid,i+1,j,dp);
        if(left!=Integer.MAX_VALUE){
            min=Math.min(min,left);
        }
        int right=solve(grid,i,j+1,dp);
        if(right!=Integer.MAX_VALUE){
            min=Math.min(min,right);
        }
        return dp[i][j]=grid[i][j]+min;
    }
}