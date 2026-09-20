// 54. Spiral Matrix

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question91 {

    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> arr = new ArrayList<>();
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;
        while(top <= bottom && left <= right){
            for(int j = left; j <= right; j++){
                arr.add(matrix[top][j]);
            }
            top++;
            for(int i = top; i <= bottom; i++){
                arr.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int j = right; j >= left; j--){
                    arr.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        List<Integer> ans = spiralOrder(matrix);
        System.out.println(ans);
        sc.close();
    }
}
