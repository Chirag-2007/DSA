// Longest subarray with sum K

import java.util.HashMap;
import java.util.Scanner;

public class Question25 {

    // Brute force solution
    // Time Complexity: O(n²), Space Complexity: O(1)
    public static int longestSubarray(int[] arr, int k){
        int n = arr.length;
        int max_count = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            int count = 0;
            for(int j = i; j < n; j++){
                sum = sum + arr[j];
                count++;
                if(sum == k){
                    max_count = Math.max(count, max_count);
                }
            }
        }
        return max_count;
    }

    // Optimal Solution
    // Time Complexity: O(n), Space Complexity: O(n)
    // Jab bhi purani cheez baar-baar search karni pade → HashMap soch.

    // sum += arr[i] → prefix banao
    // sum-k → purana prefix dhoondo
    // index difference → length nikalo

    public static int longestSubarray1(int[] arr, int k){
        int n = arr.length;
        int sum = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
            if(sum == k){
                maxLen = Math.max(maxLen, i + 1);
            }
            
            int rem = sum - k;
            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
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
        int k = sc.nextInt();
        int ans = longestSubarray1(arr, k);
        System.out.println(ans);
        sc.close();
    }
}