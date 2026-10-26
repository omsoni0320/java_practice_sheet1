package array_sheet2;
import java.util.*;

public class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n], b = new int[m];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();

        if (a.length > b.length) {
            int[] temp = a; a = b; b = temp;
        }
        int x = a.length, y = b.length;
        int low = 0, high = x;
        while (low <= high) {
            int cutA = low + (high - low) / 2;
            int cutB = (x + y + 1) / 2 - cutA;

            long leftA = cutA == 0 ? Long.MIN_VALUE : a[cutA - 1];
            long rightA = cutA == x ? Long.MAX_VALUE : a[cutA];
            long leftB = cutB == 0 ? Long.MIN_VALUE : b[cutB - 1];
            long rightB = cutB == y ? Long.MAX_VALUE : b[cutB];

            if (leftA <= rightB && leftB <= rightA) {
                long leftMax = Math.max(leftA, leftB);
                if ((x + y) % 2 == 1) {
                    System.out.printf("%.1f%n", (double) leftMax);
                } else {
                    long rightMin = Math.min(rightA, rightB);
                    System.out.printf("%.1f%n", (leftMax + rightMin) / 2.0);
                }
                sc.close();
                return;
            } else if (leftA > rightB) {
                high = cutA - 1;
            } else {
                low = cutA + 1;
            }
        }
        sc.close();
    }
}