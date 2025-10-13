class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String>list = new ArrayList<>();
        String prev= "";
        for(String word :  words){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if (!sorted.equals(prev)) {
                list.add(word);
                prev = sorted;
            }
        }
        return list;
    }
}