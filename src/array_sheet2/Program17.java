package array_sheet2;
import java.util.*;

public class Program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        int[] indegree = new int[n];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            graph.get(a).add(b);
            indegree[b]++;
        }
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) if (indegree[i] == 0) queue.offer(i);

        int completed = 0;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            completed++;
            for (int v : graph.get(u)) {
                if (--indegree[v] == 0) queue.offer(v);
            }
        }
        System.out.println(completed == n ? "YES" : "NO");
        sc.close();
    }
}