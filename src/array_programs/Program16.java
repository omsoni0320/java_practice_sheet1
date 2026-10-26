package array_programs;

import java.util.*;

public class Program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        long current = x, best = x;
        for (int i = 1; i < n; i++) {
            x = sc.nextLong();
            current = Math.max(x, current + x);
            best = Math.max(best, current);
        }
        System.out.println("Maximum Subarray Sum: " + best);
    }
}
