// 1051. Height Checker

import java.util.Arrays;
import java.util.Scanner;

public class Question126 {

    public static int heightChecker(int[] heights) {
        int n = heights.length;
        int cnt = 0;
        int[] arr = new int[n];
        int k = 0;
        for(int x : heights){
            arr[k++] = x;
        }
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            if(heights[i] != arr[i]){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for(int i = 0; i < n; i++){
            heights[i] = sc.nextInt();
        }
        int ans = heightChecker(heights);
        System.out.println(ans);
        sc.close();
    }
}
