package array_sheet2;
import java.util.*;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrival = new int[n];
        int[] departure = new int[n];
        for (int i = 0; i < n; i++) arrival[i] = sc.nextInt();
        for (int i = 0; i < n; i++) departure[i] = sc.nextInt();

        Arrays.sort(arrival);
        Arrays.sort(departure);
        int i = 0, j = 0, platforms = 0, answer = 0;

        while (i < n && j < n) {
            if (arrival[i] <= departure[j]) {
                platforms++;
                answer = Math.max(answer, platforms);
                i++;
            } else {
                platforms--;
                j++;
            }
        }
        System.out.println(answer);
        sc.close();
    }
}