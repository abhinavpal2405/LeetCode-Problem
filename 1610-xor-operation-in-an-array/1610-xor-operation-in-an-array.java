class Solution {
    public int xorOperation(int n, int start) {
        int k= start;
        for(int  i=1;i<n;i++){
            start= start+2;
            k=k^start;
        }return k;
    }
}