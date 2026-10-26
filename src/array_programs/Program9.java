package array_programs;

import java.util.*;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long largest = Long.MIN_VALUE, second = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            if (x > largest) {
                second = largest;
                largest = x;
            } else if (x < largest && x > second) {
                second = x;
            }
        }
        System.out.println("Second Largest: " +
                (second == Long.MIN_VALUE ? -1 : second));
    }
}
