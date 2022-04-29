//Not so fast
class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[]colors = new int[n];
        boolean res = solution(2,colors,0,n,graph);
        return res;
    }
    public boolean solution(int m, int[]colors,int v, int V, int[][]graph){
        if(v==V) return true;
        for(int i=1; i<=m; i++){
            if(isValid(i,colors,graph,v)){
                colors[v] = i;
                if(solution(m,colors,v+1,V,graph)){
                    return true;
                }
                colors[v]=0;
            }
        }
        return false;
    }
    public boolean isValid(int col, int[]colors, int[][]graph, int v){
        for(int i : graph[v]){
            if(colors[i]==col){
                return false;
            }
        }
        return true;
    }
}

//Optimized

class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n];
        
        for(int i = 0; i < n; i++) {
            if(colors[i] == 0 && !validColor(graph, colors, i, 1)) return false;
        }
        
        return true;
    }
    
    private boolean validColor(int[][] graph, int[] colors, int node, int color) {
        if(colors[node] != 0) return colors[node] == color;
        colors[node] = color;
        for(int i = 0; i < graph[node].length; i++) {
            if(!validColor(graph, colors, graph[node][i], -color))
                return false;
        }
        return true;
    }
}
