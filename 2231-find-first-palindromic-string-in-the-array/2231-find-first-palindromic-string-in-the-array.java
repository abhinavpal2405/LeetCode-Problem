class Solution {
    public String firstPalindrome(String[] words) {
        for(int i =0;i<words.length;i++){
            String w=words[i];
             boolean isPalindrome = true;
        for(int j=0; j <w.length() / 2;j++){
            if(w.charAt(j)!=w.charAt(w.length()-1-j)){
                isPalindrome=false;
                break;
            }
        }
            if(isPalindrome){
                return w;
            }
        }
        return"";   
     }
}