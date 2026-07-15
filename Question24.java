// Kadane's Algorithm (Maximum Subarray Sum)

// (1) Current element ko sum me add karo
// (2) Har step pe maximum answer update karo
// (3) Agar sum negative ho gaya toh usko chhod do
// ADD → UPDATE MAX → DROP NEGATIVE

import java.util.Scanner;

public class Question24 {

    // Brute force solution
    // Time Complexity: O(n²), Space Complexity: O(1)
    public int maxSubArray(int[] arr){
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += arr[j];
                if(sum > maxi){
                    maxi = sum;
                }
            }
        }
        return maxi;
    }

    // Optimal solution
    // Time Complexity = O(n), Space Complexity = O(1)
    public static int maxSubArray1(int[] arr){
        int n = arr.length;
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum > maxi){
                maxi = sum;
            }
            if(sum < 0){
                sum = 0;
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
        int ans = maxSubArray1(arr);
        System.out.println(ans);
        sc.close();
    }
}