class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        HashSet<Character> hs1 = new HashSet<>();
        for(int k=0; k<allowed.length(); k++){
            hs1.add(allowed.charAt(k));
        }
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<words.length;i++){
          
           for(int j=0; j<words[i].length(); j++){
             hs.add(words[i].charAt(j));
            }
           if(hs1.containsAll(hs)){
            count++;
           }
           hs.clear();
        }
        return count;
    }
}