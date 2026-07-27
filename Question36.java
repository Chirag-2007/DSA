// Maximum sum sub-array of size k

// Sliding Window
// Time Complexity: O(n), Space Complexity: O(1)

import java.util.Scanner;

public class Question36 {

    public static int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < k; i++){
            sum = sum + arr[i];
        }
        if(maxi < sum) maxi = sum;
        for(int i = k; i < n; i++){
            sum = sum - arr[i - k] + arr[i];
            if(maxi < sum){
                 maxi = sum;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = maxSubarraySum(arr, k);
        System.out.println(ans);
        sc.close();
    }
}
