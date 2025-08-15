class Solution {
    public int[] plusOne(int[] digits) {
        int  crry =1;
        for(int i = digits.length-1;i>=0 && crry ==1; i--){
            int tmp = digits[i] + crry;
            if(tmp>= 10){
                crry =1 ;
                digits[i] = tmp%10;
            }
            else{
                crry = 0;
                digits[i]=tmp;
            }
        }
        if (crry !=0){
            int [] newDigits = new int[digits.length+1];
            newDigits[0]=1;
            for(int i =1; i<newDigits.length;i++){
                newDigits[i]=digits[i-1];
            }
            return newDigits;
        }
        return digits;
    }
}