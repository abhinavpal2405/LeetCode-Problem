class Solution {
    public boolean divideArray(int[] nums) {
        
        int arr[]= new int [1000];
    for(int i=0;i<nums.length;i++){
        arr[nums[i]]++;
    }
    for(int i =000;i<1000;i++){
    if(arr[i]==0){
        continue;
    }
    else if(arr[i]%2==1){
        return false;
    }
    }
        return true;
    }
}