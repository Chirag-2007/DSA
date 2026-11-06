// 462. Minimum Moves to Equal Array Elements II

import java.util.Arrays;
import java.util.Scanner;

public class Question140 {

    public static int minMoves2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int mid = nums[n / 2];
        int total = 0;
        for(int i = 0; i < n; i++){
            total += Math.abs(nums[i] - mid);
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int ans = minMoves2(nums);
        System.out.println(ans);
        sc.close();
    }
}
