package array_sheet2;
import java.util.*;

public class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();

        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) dq.pollFirst();
            while (!dq.isEmpty() && a[dq.peekLast()] <= a[i]) dq.pollLast();
            dq.offerLast(i);
            if (i >= k - 1) {
                if (out.length() > 0) out.append(' ');
                out.append(a[dq.peekFirst()]);
            }
        }
        System.out.println(out);
        sc.close();
    }
}