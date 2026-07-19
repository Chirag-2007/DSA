// Count subarrays with given sum

import java.util.HashMap;
import java.util.Scanner;

public class Question28 {

    // Brute force solution
    // Time Complexity: O(n²), Space Complexity: O(1)
    public static int subarraySum(int[] arr, int k){
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            int total = 0;
            for(int j = i; j < n; j++){
                total += arr[j];
                if(total == k){
                    count++;
                }
            }
        }
        return count;
    }

    // Optimal solution (PrefixSum + HashMap)
    // Time Complexity: O(n), Space Complexity: O(n)
    public static int subarraySumOptimise(int[] arr, int k){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefixSum = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            prefixSum += arr[i];
            if(map.containsKey(prefixSum - k)){
                count += map.get(prefixSum - k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
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
        int ans = subarraySumOptimise(arr, k);
        System.out.println(ans);
        sc.close();
    }
}