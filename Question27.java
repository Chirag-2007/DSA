// 	Rearrange array elements by sign

import java.util.Scanner;

public class Question27 {

    // Time Complexity: O(n), Space Complexity: O(n)
    public static int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];
        int i = 0, j = 0;
        for (int l = 0; l < n; l++) {
            if (arr[l] > 0) {
                pos[i++] = arr[l];
            } else {
                neg[j++] = arr[l];
            }
        }
        int t = 0, k = 0;
        for (int a = 0; a < n; a++) {
            if (a % 2 == 0) {
                arr[a] = pos[t++];
            } else {
                arr[a] = neg[k++];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = rearrangeArray(arr);
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
}