package QuickUnion;

public class Main {
    private static QuickUnion quickUnion = new QuickUnion();

    public static void main(String[] args) {
        quickUnion.union(3,4);
        quickUnion.union(3,9);
        System.out.println(quickUnion.isConnected(4,9));
    }
}
