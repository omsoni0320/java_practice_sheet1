package array_sheet2;
import java.util.*;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        // Transpose in place.
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        // Reverse every row in place.
        for (int i = 0; i < n; i++) {
            for (int left = 0, right = n - 1; left < right; left++, right--) {
                int temp = a[i][left];
                a[i][left] = a[i][right];
                a[i][right] = temp;
            }
        }
        for (int[] row : a) {
            for (int j = 0; j < n; j++) {
                if (j > 0) System.out.print(" ");
                System.out.print(row[j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
