class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int min = Math.min(len1, len2);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < min; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if (len1 > len2) {
            sb.append(word1.substring(min));
        } else {
            sb.append(word2.substring(min));
        }
        return sb.toString();
    }
}
