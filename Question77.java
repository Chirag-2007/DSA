// 3702. Longest Subsequence With Non-Zero Bitwise XOR

import java.util.Scanner;

public class Question77 {

    public static int longestSubsequence(int[] arr) {
        int n = arr.length;
        int xor = 0;
        int countZero = 0;
        for(int i = 0; i < n; i++){
            xor = xor ^ arr[i];
            if(arr[i] == 0){
                countZero++;
            }
        }
        if(xor != 0){
            return n;
        }
        if(countZero == n){
            return 0;
        }
        return n - 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = longestSubsequence(arr);
        System.out.println(ans);
        sc.close();
    }
}
