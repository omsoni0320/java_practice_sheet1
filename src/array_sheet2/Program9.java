package array_sheet2;
import java.util.*;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt(), cols = sc.nextInt();
        int[][] a = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                a[i][j] = sc.nextInt();

        long best = Long.MIN_VALUE;
        for (int left = 0; left < cols; left++) {
            long[] sums = new long[rows];
            for (int right = left; right < cols; right++) {
                for (int r = 0; r < rows; r++) sums[r] += a[r][right];
                long current = sums[0], ending = sums[0];
                for (int r = 1; r < rows; r++) {
                    ending = Math.max(sums[r], ending + sums[r]);
                    current = Math.max(current, ending);
                }
                best = Math.max(best, current);
            }
        }
        System.out.println(best);
        sc.close();
    }
}