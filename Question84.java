// 3471. Find the Largest Almost Missing Integer

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Question84 {

    public static int largestInteger(int[] arr, int k) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i <= n - k; i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j = i; j < i + k; j++){
                set.add(arr[j]);
            }
            for(int num : set){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        int maxi = Integer.MIN_VALUE;
        for(int t = 0; t < n; t++){
            if(map.get(arr[t]) == 1){
                maxi = Math.max(maxi, arr[t]);
            }
        }
        if(maxi == Integer.MIN_VALUE){
            return -1;
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
        int k  =sc.nextInt();
        int ans = largestInteger(arr, k); 
        System.out.println(ans);
        sc.close();
    }
}
