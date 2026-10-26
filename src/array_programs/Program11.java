package array_programs;

import java.util.*;

public class Program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n], result = new int[n];
        int size = 0;
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            boolean seen = false;
            for (int j = 0; j < size; j++) {
                if (result[j] == a[i]) { seen = true; break; }
            }
            if (!seen) result[size++] = a[i];
        }
        for (int i = 0; i < size; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(result[i]);
        }
        System.out.println();
    }
}