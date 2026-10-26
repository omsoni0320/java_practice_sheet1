package array_sheet2;
import java.util.*;

public class Program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt(), cols = sc.nextInt();
        int[][] grid = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                grid[i][j] = sc.nextInt();

        int islands = 0;
        int[] dr = {-1, 1, 0, 0}, dc = {0, 0, -1, 1};
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] != 1) continue;
                islands++;
                grid[r][c] = 0;
                stack.push(r * cols + c);
                while (!stack.isEmpty()) {
                    int cell = stack.pop();
                    int cr = cell / cols, cc = cell % cols;
                    for (int d = 0; d < 4; d++) {
                        int nr = cr + dr[d], nc = cc + dc[d];
                        if (nr >= 0 && nr < rows && nc >= 0 && nc < cols
                                && grid[nr][nc] == 1) {
                            grid[nr][nc] = 0;
                            stack.push(nr * cols + nc);
                        }
                    }
                }
            }
        }
        System.out.println(islands);
        sc.close();
    }
}