import java.util.*;
public class floydwarshall {
    public static void shortestpath(int[][]graph){
        int n = graph.length;
        int[][]dist = new int[n][n];
        for(int[]row:dist){
            Arrays.fill(row,1000); //we use infinite instead of 1000 here
        }
        for(int i=0; i<n; i++){
            dist[i][i] = 0;
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(graph[i][j]==0) continue;
                dist[i][j] = graph[i][j];
            }
        }
        for(int k=0; k<n; k++){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    dist[i][j] = Math.min(dist[i][j],dist[i][k]+dist[k][j]);
                }
            }
        }
        //printing distance
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(dist[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        int[][]graph = {{0,2,0,0,-4},
                        {0,0,0,1,7},
                        {0,4,0,0,0},
                        {2,0,-5,0,0},
                        {0,0,0,6,0}};
        shortestpath(graph);
    }
}
