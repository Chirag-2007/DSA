// 2006. Count Number of Pairs With Absolute Difference K

import java.util.HashMap;
import java.util.Scanner;

public class Question94 {

    public static int countKDifference(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < n; i++){
            if(map.containsKey(nums[i] - k)){
                count += map.get(nums[i] - k);
            }
            if(map.containsKey(nums[i] + k)){
                count += map.get(nums[i] + k);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = countKDifference(nums, k);
        System.out.println(ans);
        sc.close();
    }
}
