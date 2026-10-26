package array_sheet2;
import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        Map<Long, Integer> firstIndex = new HashMap<>();
        firstIndex.put(0L, -1);
        long prefix = 0;
        int best = 0;

        for (int i = 0; i < n; i++) {
            prefix += sc.nextLong();
            if (firstIndex.containsKey(prefix - k)) {
                best = Math.max(best, i - firstIndex.get(prefix - k));
            }
            firstIndex.putIfAbsent(prefix, i);
        }
        System.out.println(best);
        sc.close();
    }
}