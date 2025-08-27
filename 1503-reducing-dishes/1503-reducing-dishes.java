class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        int s[]=satisfaction;
        Arrays.sort(s);
        int n =s.length;
        int total=0;
        int res=0;
        for(int i =n-1;i>=0;i--){
            total += s[i];
            if(total>0){
                res += total;
            }else{
                break;
            }
        }
        return res;
    }
}