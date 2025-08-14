class Solution {
    public String largestGoodInteger(String num) {
        // String s = "";
        // for (int i = 0; i < num.length(); i++) {
            // if (num.contains("999") || num.contains("888") || num.contains("777") ||
            //     num.contains("666") || num.contains("555") || num.contains("444") ||
            //     num.contains("333") || num.contains("222") || num.contains("111") ||
            //     num.contains("000")) {
                if (num.contains("999")) return "999";
                if (num.contains("888")) return "888";
                if (num.contains("777")) return "777";
                if (num.contains("666")) return "666";
                if (num.contains("555")) return "555";
                if (num.contains("444")) return "444";
                if (num.contains("333")) return "333";
                if (num.contains("222")) return "222";
                if (num.contains("111")) return "111";
                if (num.contains("000")) return "000";
            
     //   }}
        return "";
    }
}
