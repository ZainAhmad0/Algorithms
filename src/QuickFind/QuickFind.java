package QuickFind;

public class QuickFind {
    private int [] id = new int[10];

    public QuickFind(){
        for(int i=0; i<10; i++){
            id[i]=i;
        }
    }
    public boolean isConnected(int a, int b){
        return (id[a]==id[b]);
    }
    public void union(int a, int b){
        int first, second;
        first = id[a];
        second = id [b];
        for(int i=0; i<id.length; i++){
            if(id[i]==a)
            {
                id[i]=b;
            }
        }
    }
}
