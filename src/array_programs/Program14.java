package array_programs;

import java.util.*;

public class Program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long mainSum = 0, secondarySum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                long x = sc.nextLong();
                if (i == j) mainSum += x;
                if (i + j == n - 1) secondarySum += x;
            }
        }
        System.out.println("Main Diagonal Sum: " + mainSum);
        System.out.println("Secondary Diagonal Sum: " + secondarySum);
        System.out.println("Difference: " + Math.abs(mainSum - secondarySum));
    }
}
