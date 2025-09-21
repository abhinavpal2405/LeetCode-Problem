class Solution {
    public int[] minCosts(int[] cost) {
        int prev=cost[0];
        for(int i=1;i<cost.length;i++)
        {
            if(prev<cost[i])
            cost[i]=prev;
            else
            prev=cost[i];
        }
        return cost;
    }
}