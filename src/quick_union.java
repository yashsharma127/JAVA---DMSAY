public class quick_union {
    private static int[] id;
    public static void QuickfindUF(int N){
        id = new int[N];
        for(int i =0; i<N; i++)
            id[i] = i;
        System.out.println("array made");
    }

    public static int root(int i) {
        while(i != id[i]) i = id[i];
        return i;
    }

    public static boolean connected(int p, int q){
        return root(p) == root(q);
    }

    public static void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
        System.out.println("union done");
    }

    public static void main(String[] args) {
        QuickfindUF(9);
        union(2,5);
        union(3,7);

        boolean result = connected(7,3);
        System.out.println(result);


    }
}
