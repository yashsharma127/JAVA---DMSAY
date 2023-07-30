public class quick_find {
    private static int[] id;
    public static void QuickfindUF(int N){
        id = new int[N];
                for(int i =0; i<N; i++)
                    id[i] = i;
        System.out.println("array made");
    }

    public static boolean connected(int p, int q){
        return id[p] == id[q];
    }

    public static void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for (int i =0; i< id.length; i++)
            if(id[i] == pid) id[i] = qid;
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
