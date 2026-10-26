package array_programs;

import java.util.*;

public class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();

        int i = 0, j = 0;
        StringBuilder out = new StringBuilder();
        while (i < n || j < m) {
            int x;
            if (j == m || (i < n && a[i] <= b[j])) x = a[i++];
            else x = b[j++];
            if (out.length() > 0) out.append(' ');
            out.append(x);
        }
        System.out.println(out);
    }
}