package QuickFind;

public class Main {
   private static QuickFind obj = new QuickFind();
    public static void main(String[] args) {
        obj.union(2,3);
        obj.union(3,4);
        System.out.println(obj.isConnected(2,4));
    }
}
