package array_sheet2;
import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        long maxEnding = x, minEnding = x, answer = x;

        for (int i = 1; i < n; i++) {
            x = sc.nextLong();
            if (x < 0) {
                long temp = maxEnding;
                maxEnding = minEnding;
                minEnding = temp;
            }
            maxEnding = Math.max(x, maxEnding * x);
            minEnding = Math.min(x, minEnding * x);
            answer = Math.max(answer, maxEnding);
        }
        System.out.println(answer);
        sc.close();
    }
}
