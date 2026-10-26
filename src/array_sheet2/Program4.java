package array_sheet2;
import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        for (int[] cur : intervals) {
            if (merged.isEmpty() || cur[0] > merged.get(merged.size() - 1)[1]) {
                merged.add(new int[]{cur[0], cur[1]});
            } else {
                int[] last = merged.get(merged.size() - 1);
                last[1] = Math.max(last[1], cur[1]);
            }
        }

        System.out.println(merged.size());
        for (int[] in : merged) System.out.println(in[0] + " " + in[1]);
        sc.close();
    }
}
