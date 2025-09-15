class Solution {
    public int canBeTypedWords(String text, String b ) {
        String arr[]=text.split(" ");
        int count = arr.length;

        for(int i=0;i<arr.length;i++){
            String s=arr[i];
            for(int j =0;j<b.length();j++){
                if(s.contains(String.valueOf(b.charAt(j)))){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}