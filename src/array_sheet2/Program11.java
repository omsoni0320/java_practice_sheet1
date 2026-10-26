package array_sheet2;
import java.util.*;

public class Program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] h = new long[n];
        for (int i = 0; i < n; i++) h[i] = sc.nextLong();

        int left = 0, right = n - 1;
        long leftMax = 0, rightMax = 0, water = 0;
        while (left <= right) {
            if (leftMax <= rightMax) {
                leftMax = Math.max(leftMax, h[left]);
                water += leftMax - h[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, h[right]);
                water += rightMax - h[right];
                right--;
            }
        }
        System.out.println(water);
        sc.close();
    }
}