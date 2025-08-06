class Solution {
    public String sortSentence(String s) {
        String [] words = s.split(" ");
        String [] result = new String[words.length];

        for(String word : words){
            int j = word.charAt(word.length()-1); 
            int k = j -'1';
            result[k] = word.substring(0,word.length()-1); 
        }
        return String.join(" ", result);
    }
}