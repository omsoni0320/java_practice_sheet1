package array_sheet2;
import java.util.*;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Long> values = new HashSet<>();
        for (int i = 0; i < n; i++) values.add(sc.nextLong());

        int best = 0;
        for (long x : values) {
            if (!values.contains(x - 1)) {
                long cur = x;
                int length = 1;
                while (values.contains(cur + 1)) {
                    cur++;
                    length++;
                }
                best = Math.max(best, length);
            }
        }
        System.out.println(best);
        sc.close();
    }
}
