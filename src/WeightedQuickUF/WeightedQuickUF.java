package WeightedQuickUF;

public class WeightedQuickUF {
    private int[] id = new int[10];
    private int[] size = new int[10];

    public WeightedQuickUF() {
        for (int i = 0; i < 10; i++) {
            id[i] = size[i] = i;
        }
    }

    private int findRoot(int a) {
        while (a != id[a]) {
            a = id[a];
        }
        return a;
    }

    public boolean isConnected(int a, int b) {
        return (findRoot(a) == findRoot(b));
    }

    public void union(int a, int b) {
        int d = findRoot(a);//i
        int e = findRoot(b);//j
        if (d == e) {
            return;
        }
        else if (size[d] < size[e]) {
            id[d]=e;
            size[e]+=size[d];
        }
        else {
            id[e]=d;
            size[d]+=size[e];
        }
    }
}
