class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int n=candyType.length;
        int m=n/2;
        int count=1;
        for(int i =0;i <n-1;i++){
            if(candyType[i] !=candyType[i+1]){
                 count++;
            }
         }
            if(count > m){
                return m;
            
        }
        return count;
    }
}