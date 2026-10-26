package array_programs;

import java.util.*;

public class Program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        long[][] a = new long[r1][c1];
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++) a[i][j] = sc.nextLong();

        int r2 = sc.nextInt(), c2 = sc.nextInt();
        long[][] b = new long[r2][c2];
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++) b[i][j] = sc.nextLong();

        if (c1 != r2) {
            System.out.println("Matrix Multiplication Not Possible");
            return;
        }

        long[][] result = new long[r1][c2];
        for (int i = 0; i < r1; i++)
            for (int k = 0; k < c1; k++)
                for (int j = 0; j < c2; j++)
                    result[i][j] += a[i][k] * b[k][j];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                if (j > 0) System.out.print(" ");
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}