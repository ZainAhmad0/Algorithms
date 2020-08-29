package WeightedQuickUF;


public class Main {
    private static WeightedQuickUF weightedQuickUF = new WeightedQuickUF();
    public static void main(String[] args) {
        weightedQuickUF.union(3,4);
        weightedQuickUF.union(3,9);
        System.out.println(weightedQuickUF.isConnected(4,9));
    }
}
