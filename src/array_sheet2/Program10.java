package array_sheet2;
import java.util.*;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long twoBack = 0, oneBack = 0;
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            long current = Math.max(oneBack, twoBack + x);
            twoBack = oneBack;
            oneBack = current;
        }
        System.out.println(oneBack);
        sc.close();
    }
}