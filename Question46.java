// Longest Continuous Increasing Subsequence

import java.util.Scanner;

public class Question46 {

    public static int findLengthOfLCIS(int[] arr){
        int n = arr.length;
        int count = 1;
        int maxLen = 1;
        for(int i = 0; i < n - 1; i++){
            if(arr[i] < arr[i + 1]){
                count++;
                maxLen = Math.max(maxLen, count);
            }
            else{
                count = 1;
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = findLengthOfLCIS(arr);
        System.out.println(ans);
        sc.close();
    }
}
