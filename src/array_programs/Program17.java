package array_programs;

import java.util.*;

public class Program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] marks = new int[n];
        long total = 0;
        int highest = Integer.MIN_VALUE, lowest = Integer.MAX_VALUE, passed = 0;

        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
            highest = Math.max(highest, marks[i]);
            lowest = Math.min(lowest, marks[i]);
            if (marks[i] >= 40) passed++;
        }

        double average = (double) total / n;
        int aboveAverage = 0;
        for (int mark : marks) if (mark > average) aboveAverage++;

        System.out.printf(Locale.US, "Average: %.2f%n", average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + (n - passed));
        System.out.println("Above Average: " + aboveAverage);
    }
}