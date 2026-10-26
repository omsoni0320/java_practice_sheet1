package array_sheet2;
import java.util.*;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] meetings = new int[n][2];
        for (int i = 0; i < n; i++) {
            meetings[i][0] = sc.nextInt();
            meetings[i][1] = sc.nextInt();
        }
        if (n == 0) {
            System.out.println(0);
            sc.close();
            return;
        }
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> ends = new PriorityQueue<>();
        int answer = 0;
        for (int[] meeting : meetings) {
            while (!ends.isEmpty() && ends.peek() <= meeting[0]) ends.poll();
            ends.offer(meeting[1]);
            answer = Math.max(answer, ends.size());
        }
        System.out.println(answer);
        sc.close();
    }
}
