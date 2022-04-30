import java.util.*;
public class bellmanford {
    public static void shortestpath(int[][]graph){
        int vertices = graph.length;
        int[]dist = new int[vertices];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0] = 0;
        for(int i=1; i<vertices; i++){
            for(int u=0; u<vertices; u++) {
                for (int v = 0; v < vertices; v++) {
                    if (graph[u][v] == 0) continue;
                    if (dist[v] > dist[u] + graph[u][v]) {
                        dist[v] = dist[u] + graph[u][v];
                    }
                }
            }
        }
        for(int i=0; i<vertices; i++){
            System.out.print(dist[i]+" ");
        }
    }
    public static void main(String[]args){
        int[][]graph = {{0,4,2,0,0},
                        {0,0,1,2,3},
                        {0,1,0,4,5},
                        {0,0,0,0,0},
                        {0,0,0,-5,0}};
        shortestpath(graph);

    }
}
