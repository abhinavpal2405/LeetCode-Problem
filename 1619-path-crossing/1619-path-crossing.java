class Solution {
    public boolean isPathCrossing(String path) {
        int x=0;
        int y=0;
        Set<String> visited = new HashSet<>();
        visited.add(x + "," + y);
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir =='N'){
                y++;

            }else if(dir =='S'){
                y--;
            }else if(dir == 'E'){
                x++;
            }else if(dir == 'W') {
                x--;
            }
            String pos = x +","+y;
            if(visited.contains(pos)){
                return true;
            }
            visited.add(pos);
        }
          return false;
    }
}