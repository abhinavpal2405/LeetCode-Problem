class Solution {
    public boolean isValid(String s) {
        if(s==null){
            return false;
        }
        while(s.contains("()")||s.contains("[]")||s.contains("{}")){
            s=s.replace("()","");
            s=s.replace("[]",""); 
            s=s.replace("{}","");
        }if(s.equals("")){
            return true;
        }
        return false;
    }
}