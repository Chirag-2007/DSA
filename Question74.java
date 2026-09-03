// 1886. Determine Whether Matrix Can Be Obtained By Rotation

import java.util.Scanner;

public class Question74 {

    public static int[][] rotateArray(int[][] mat){
        int n = mat.length;
        for(int i = 0; i < n; i++){
            for(int j =  i + 1; j < n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n / 2; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][n - j - 1];
                mat[i][n - j - 1] = temp;
            }
        }
        return mat;
    }

    public static boolean check(int[][] mat, int[][] target){
        int n = mat.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        for(int i = 0; i < 4; i++){
            if(check(mat, target) == true){
                return true;
            }
            rotateArray(mat);
        }
        return false;
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
        int[][] target = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                target[i][j] = sc.nextInt();
            }
        }
        boolean ans = findRotation(mat, target);
        System.out.println(ans);
        sc.close();
    }
}
