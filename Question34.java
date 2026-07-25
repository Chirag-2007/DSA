// LeetCode 1343 — Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
// Time Complexity: O(n), Space Complexity: O(1)

import java.util.Scanner;

public class Question34 {

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int count = 0;
        int total = 0;
        for(int i = 0; i < k; i++){
            total += arr[i];
        }
        if(total / k >= threshold) count++;
        for(int i = k; i < n; i++){
            total = total - arr[i - k] + arr[i];
            if(total / k >= threshold) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int threshold = sc.nextInt();
        int ans = numOfSubarrays(arr, k, threshold);
        System.out.println(ans);
        sc.close();
    }
}