// 1572. Matrix Diagonal Sum

import java.util.Scanner;

public class Question98 {

    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int total = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j || i + j == n - 1){
                    total += mat[i][j];
                }
            }
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int ans = diagonalSum(mat);
        System.out.println(ans);
        sc.close();
    }
}
