package array_programs;
import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long first = sc.nextLong(), max = first, min = first;
        for (int i = 1; i < n; i++) {
            long x = sc.nextLong();
            max = Math.max(max, x);
            min = Math.min(min, x);
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
