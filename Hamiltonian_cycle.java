// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static boolean hamiltonian(HashMap<Integer,List<Integer>> graph ,List<Integer>path,int v,boolean[]vis, int n){
        if(path.size()==n){
            return true;
        }
        for(int i=0; i<graph.get(v).size(); i++){
            int node = graph.get(v).get(i);
            if(vis[i]==true) continue;
            vis[i] = true;
            path.add(node);
            if (hamiltonian(graph,path,node,vis,n)){
                return true;
            }
            vis[node] = false;
            path.remove(path.size()-1);
            
        }
        return false;
    }
    public static void add(HashMap<Integer,List<Integer>> graph, int u, int v){
        if(graph.containsKey(u)){
            graph.get(u).add(v);
            return;
        }
        graph.put(u,new LinkedList<>());
        graph.get(u).add(v);
    }
    public static void main(String[] args) {
        HashMap<Integer,List<Integer>> graph = new HashMap<>();
        add(graph,0,5);
        add(graph,0,1);
        add(graph,0,4);
        add(graph,0,3);
        add(graph,1,5);
        add(graph,1,0);
        add(graph,1,4);
        add(graph,1,2);
        add(graph,2,1);
        add(graph,2,4);
        add(graph,2,3);
        add(graph,2,6);
        add(graph,3,0);
        add(graph,3,4);
        add(graph,3,2);
        add(graph,3,6);
        add(graph,4,0);
        add(graph,4,1);
        add(graph,4,3);
        add(graph,4,2);
        add(graph,5,0);
        add(graph,5,1);
        add(graph,6,3);
        add(graph,6,2);
        
    List<Integer>path = new LinkedList<>();
    boolean[]vis = new boolean[7];
    if(hamiltonian(graph,path,0,vis,7)){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+" ");
        }
    }
    }
}
