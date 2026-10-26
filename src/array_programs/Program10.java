package array_programs;

import java.util.*;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean[] counted = new boolean[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (counted[i]) continue;
            int frequency = 0;
            for (int j = i; j < n; j++) {
                if (a[j] == a[i]) {
                    frequency++;
                    counted[j] = true;
                }
            }
            System.out.println("Element: " + a[i] +
                    " Frequency: " + frequency);
        }
    }
}