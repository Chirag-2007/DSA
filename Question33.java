// Maximum Sum Subarray of Size K
// Time Complexity: O(n), Space Complexity: O(1)

// Pattern: Fixed Sliding Window
// 1st window sum calculate kr lo.
// After then 1-1 position se slide karte jao window se by using formula.
// sum = sum - arr[i - k] + arr[i];
// arr[i - k] -> outgoing element
// arr[i] -> incoming element

import java.util.Scanner;

public class Question33 {

    public static int maxSubarraySum(int[] arr, int k){
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        maxSum = sum;
        for(int i = k; i < n; i++){
            sum = sum - arr[i - k] + arr[i];
            if(maxSum < sum){
                maxSum = sum;
            }
        }
        return maxSum;
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