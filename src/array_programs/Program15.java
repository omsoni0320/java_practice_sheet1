package array_programs;

import java.util.*;

public class Program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        long[][] a = new long[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) a[i][j] = sc.nextLong();

        long[] rowSum = new long[r], colSum = new long[c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                rowSum[i] += a[i][j];
                colSum[j] += a[i][j];
            }

        int bestRow = 0;
        for (int i = 0; i < r; i++) {
            System.out.println("Row " + (i + 1) + " Sum: " + rowSum[i]);
            if (rowSum[i] > rowSum[bestRow]) bestRow = i;
        }
        for (int j = 0; j < c; j++)
            System.out.println("Column " + (j + 1) + " Sum: " + colSum[j]);

        System.out.println("Highest Sales Branch: " + (bestRow + 1));
        System.out.println("Highest Sales: " + rowSum[bestRow]);
    }
}