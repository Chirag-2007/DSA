// 1. Two Sum

import java.util.HashMap;
import java.util.Scanner;

public class Question123 {

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0; i < n; i++){
            int key = target - nums[i];
            if(map.containsKey(key) && map.get(key) != i){
                ans[0] = i;
                ans[1] = map.get(key);
                break;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] ans = twoSum(nums, target);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
}
