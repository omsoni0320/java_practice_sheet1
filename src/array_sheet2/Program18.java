package array_sheet2;
import java.util.*;

public class Program18 {
    static class Edge {
        int to;
        long weight;
        Edge(int to, long weight) { this.to = to; this.weight = weight; }
    }
    static class State implements Comparable<State> {
        int node;
        long distance;
        State(int node, long distance) { this.node = node; this.distance = distance; }
        public int compareTo(State other) { return Long.compare(distance, other.distance); }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), source = sc.nextInt();
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            long w = sc.nextLong();
            graph.get(u).add(new Edge(v, w));
            graph.get(v).add(new Edge(u, w));
        }

        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[source] = 0;
        PriorityQueue<State> pq = new PriorityQueue<>();
        pq.offer(new State(source, 0));

        while (!pq.isEmpty()) {
            State cur = pq.poll();
            if (cur.distance != dist[cur.node]) continue;
            for (Edge edge : graph.get(cur.node)) {
                if (cur.distance <= Long.MAX_VALUE - edge.weight
                        && cur.distance + edge.weight < dist[edge.to]) {
                    dist[edge.to] = cur.distance + edge.weight;
                    pq.offer(new State(edge.to, dist[edge.to]));
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(dist[i] == Long.MAX_VALUE ? -1 : dist[i]);
        }
        System.out.println();
        sc.close();
    }
}