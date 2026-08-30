// 2958. Length of Longest Subarray With at Most K Frequency

import java.util.HashMap;
import java.util.Scanner;

public class Question70 {

    public static int maxSubarrayLength(int[] arr, int k){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int i = 0, j = 0;
        while(j < n){
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            if(map.get(arr[j]) > k){
                while(map.get(arr[j]) > k){
                    map.put(arr[i], map.get(arr[i]) - 1);
                    i++;
                }
            }
            if(map.get(arr[j]) <= k){
                maxLen = Math.max(maxLen, (j - i + 1));
            }
            j++;
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
        int ans = maxSubarrayLength(arr, k);
        System.out.println(ans);
        sc.close();
    }
}
