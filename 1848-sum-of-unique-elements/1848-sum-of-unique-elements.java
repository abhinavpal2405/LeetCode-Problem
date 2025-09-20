class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i =0;i<nums.length;i++){
            int count=0;
            for(int j =0;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                sum +=nums[i];
            }
        }
        return sum;
    }
}