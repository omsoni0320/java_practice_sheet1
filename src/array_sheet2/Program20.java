package array_sheet2;
import java.util.*;

public class Program20 {
    static class Edge implements Comparable<Edge> {
        int u, v;
        long weight;
        Edge(int u, int v, long weight) {
            this.u = u; this.v = v; this.weight = weight;
        }
        public int compareTo(Edge other) {
            return Long.compare(weight, other.weight);
        }
    }

    static class DSU {
        int[] parent, size;
        DSU(int n) {
            parent = new int[n];
            size = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }
        int find(int x) {
            while (parent[x] != x) {
                parent[x] = parent[parent[x]];
                x = parent[x];
            }
            return x;
        }
        boolean union(int a, int b) {
            a = find(a); b = find(b);
            if (a == b) return false;
            if (size[a] < size[b]) {
                int temp = a; a = b; b = temp;
            }
            parent[b] = a;
            size[a] += size[b];
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        Edge[] edges = new Edge[m];
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            long w = sc.nextLong();
            edges[i] = new Edge(u, v, w);
        }
        Arrays.sort(edges);
        DSU dsu = new DSU(n);
        long cost = 0;
        int used = 0;
        for (Edge e : edges) {
            if (dsu.union(e.u, e.v)) {
                cost += e.weight;
                used++;
                if (used == n - 1) break;
            }
        }
        System.out.println(used == n - 1 ? cost : -1);
        sc.close();
    }
}