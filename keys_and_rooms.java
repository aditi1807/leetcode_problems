class Solution {
    static void solve(List<List<Integer>> rooms,int key,boolean vis[]){
        vis[key]=true;
        for(int i=0;i<rooms.get(key).size();i++)
        {
            if(vis[rooms.get(key).get(i)]==false)
            solve(rooms,rooms.get(key).get(i),vis);            
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis=new boolean[rooms.size()];
        Arrays.fill(vis,false);
        vis[0]=true;
        solve(rooms,0,vis);
        for(int i=0;i<vis.length;i++)
        if(vis[i]==false)
        return false;
        return true;
    }
}