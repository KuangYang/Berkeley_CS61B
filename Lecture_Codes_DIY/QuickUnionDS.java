public class QuickUnionDS implements DisjointSets {
    private int[] parent;
    private int[] size;

    public QuickUnionDS(int N) {
        this.parent = new int[N];
        for (int i = 0; i < N; i++) {
            this.parent[i] = i;
            this.size[i] = 1;
        }
    }

    /* Original findRoot */
    private int findRoot(int p) {
        while (p != this.parent[p]) {
            p = this.parent[p];
        }
        return p;
    }

    /** Modifications: Add Path Compression into Weighted QuickUnion */
    private int findRoot_PathCompression(int p) {
        if (p == this.parent[p]) {
            return p;
        } else {
            this.parent[p] = findRoot_PathCompression(this.parent[p]);
            return this.parent[p];
        }
    }

    /** Path-Compression Version */
    public boolean isConnected(int p, int q) {
        return this.findRoot_PathCompression(p) == this.findRoot_PathCompression(q);
    }

    /** Original Connect */
    public void connect(int p, int q) {
        int p_root = this.findRoot(p);
        int q_root = this.findRoot(q);
        if (p_root == q_root)
            return;
        this.parent[p_root] = q_root;
    }

    /* Modification: Use Weighted QuickUnion to avoid very tall tree
       Track tree size and always link root of smaller tree to larger tree
    */
    public void connect_WeightedQuickUnion(int p, int q) {
        int p_root = this.findRoot_PathCompression(p);
        int q_root = this.findRoot_PathCompression(q);
        if (p_root == q_root)
            return;
        if (this.size[p_root] > this.size[q_root]) {
            this.parent[q_root] = p_root;
            this.size[p_root] += this.size[q_root];
        } else {
            this.parent[p_root] = q_root;
            this.size[q_root] += this.size[p_root];
        }
    }
}
