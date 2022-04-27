class UnionFind{
    int[]parent;
    public UnionFind(int n){
        parent = new int[n];
        for(int i=0; i<n; i++){
            parent[i] = i;
        } 
    }
    public int getparent(int i){
        if(parent[i]!=i){
            parent[i] = getparent(parent[i]);
        }
        return parent[i];
    }
    public void unify(int i, int j){
        int pari = getparent(i);
        int parj = getparent(j);
        if(pari==parj){
            return;
        }
        parent[parj] = pari;

    }
}
