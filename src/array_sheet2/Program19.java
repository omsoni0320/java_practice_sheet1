package array_sheet2;
import java.util.*;

public class Program19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] h = new long[n];
        for (int i = 0; i < n; i++) h[i] = sc.nextLong();

        int[] stack = new int[n + 1];
        int top = -1;
        long best = 0;
        for (int i = 0; i <= n; i++) {
            long currentHeight = (i == n) ? 0 : h[i];
            while (top >= 0 && h[stack[top]] > currentHeight) {
                long height = h[stack[top--]];
                int leftSmaller = top >= 0 ? stack[top] : -1;
                long width = i - leftSmaller - 1L;
                best = Math.max(best, height * width);
            }
            if (i < n) stack[++top] = i;
        }
        System.out.println(best);
        sc.close();
    }
}