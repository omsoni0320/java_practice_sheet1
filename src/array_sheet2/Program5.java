package array_sheet2;
import java.util.*;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        Map<Long, Long> count = new HashMap<>();
        count.put(0L, 1L);
        long prefix = 0, answer = 0;

        for (int i = 0; i < n; i++) {
            prefix += sc.nextLong();
            answer += count.getOrDefault(prefix - k, 0L);
            count.put(prefix, count.getOrDefault(prefix, 0L) + 1);
        }
        System.out.println(answer);
        sc.close();
    }
}
