class Solution {
    public int tribonacci(int n) {
         if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            int frst=0;
             int sec=1;
             int thrd=1;
            for(int i =1;i<=n;i++){
            int fourth=frst+sec+thrd;
            frst=sec;
            sec=thrd;
            thrd=fourth;
            }
        return frst;
        }
    }
}