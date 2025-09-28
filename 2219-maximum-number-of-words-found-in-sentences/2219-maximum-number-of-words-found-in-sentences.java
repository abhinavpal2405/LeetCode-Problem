class Solution {
    public int mostWordsFound(String[] sent) {
        int count =0;
        
        for(String sen: sent){
            String word[]=sen.split(" ");
            count = Math.max(count,word.length);
        }
        return count;
    }
}