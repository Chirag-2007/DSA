// 1351. Count Negative Numbers in a Sorted Matrix

import java.util.Scanner;

public class Question124 {

    public static int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for(int i = 0; i < m; i++){
            int  start = 0, end = n - 1;
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(grid[i][mid] >= 0){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            ans += (grid[i].length - start);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        int ans = countNegatives(grid);
        System.out.println(ans);
        sc.close();
    }
}
