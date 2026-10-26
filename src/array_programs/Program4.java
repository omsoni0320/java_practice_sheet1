package array_programs;

import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int target = sc.nextInt(), index = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == target) { index = i; break; }
        }
        System.out.println("Index: " + index);
    }
}