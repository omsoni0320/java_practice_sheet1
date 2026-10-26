package array_sheet2;
import java.util.*;

public class Program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) prefix[i + 1] = prefix[i] + sc.nextLong();

        Deque<Integer> dq = new ArrayDeque<>();
        int best = n + 1;
        for (int i = 0; i <= n; i++) {
            while (!dq.isEmpty() && prefix[i] - prefix[dq.peekFirst()] >= k) {
                best = Math.min(best, i - dq.pollFirst());
            }
            while (!dq.isEmpty() && prefix[i] <= prefix[dq.peekLast()]) dq.pollLast();
            dq.offerLast(i);
        }
        System.out.println(best == n + 1 ? -1 : best);
        sc.close();
    }
}
