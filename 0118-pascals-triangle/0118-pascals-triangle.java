class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ls = new ArrayList<>();

        for(int i= 0; i<numRows ;i++){
            List<Integer> lt = new ArrayList<>();
               for(int j = 0; j<=i;j++){
                if(j==0 || i==j) lt.add(1);
                else{
                  int value = ls.get(i-1).get(j) + ls.get(i-1).get(j-1);
                  lt.add(value);
                }
            }
            ls.add(lt);
        }
        return ls;
    }
}