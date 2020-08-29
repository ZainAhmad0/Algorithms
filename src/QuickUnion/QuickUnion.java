package QuickUnion;

public class QuickUnion {
    private int []id = new int[10];
    public QuickUnion(){
        for(int i =0 ; i<10; i++) {
            id[i] = i;
        }
    }
    public int findRoot(int i){
        while(i!=id[i]){
            i=id[i];
        }
        return i;
    }
    public void union(int a, int b){
        int i=findRoot(a);
        int j=findRoot(b);
        id[i]=j;
    }
    public boolean isConnected(int a, int b){
        return (findRoot(a)==findRoot(b));
    }

}
